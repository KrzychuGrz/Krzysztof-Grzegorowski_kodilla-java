package com.kodilla.hibernate2.invoice.dao;

import com.kodilla.hibernate2.invoice.Invoice;
import com.kodilla.hibernate2.invoice.Item;
import com.kodilla.hibernate2.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class InvoiceDaoTestSuite {


        @Autowired
        private InvoiceDao invoiceDao;



        @Test
        void InvoiceDaoTestSuite() {
               //given

               List<Item> items = new ArrayList<>();

                Invoice invoice = new Invoice("one", items);


                //when
                invoiceDao.save(invoice);

                //then
                int id = invoice.getId();
                Optional<Invoice> saveInvoice = invoiceDao.findById(id);
                assertTrue(saveInvoice.isPresent());

        }
}
