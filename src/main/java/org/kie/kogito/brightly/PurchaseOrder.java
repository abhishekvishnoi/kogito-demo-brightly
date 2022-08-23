/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito.brightly;

import java.io.Serializable;

public class PurchaseOrder implements Serializable {

    private String item;

    private String email;

    private String customer;

    private Boolean approved;

    private Integer totalAmount;

    // @Override
    // public String toString() {
    //     return "PurchaseOrder [customer=" + customer + ", email=" + email + ", item=" + item + ", totalAmount="
    //             + totalAmount + "]";
    // }

    public PurchaseOrder() {
    }

    @Override
    public String toString() {
        return "Order [approved=" + approved + ", customer=" + customer + ", email=" + email + ", item=" + item
                + "]";
    }

    public PurchaseOrder(String item, String email, String customer, Integer totalAmount) {
        this.item = item;
        this.email = email;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Boolean isApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

}
