rest-utils
==========

Simple utilities for performing all REST-related operations

# Introduction

# Notes

Example of (hopefully) usage:

    new Restinator(<uri>)
        .params(
            Param
                .add("","")
                .add("",""))
        .headers(
            Header
                .add("","")
                .add("",""))
        .authentication(
            Authentication.add(BASIC, User.create("", ""))
        .get();