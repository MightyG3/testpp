package org.example;


import org.junit.jupiter.api.Tag;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("org.example")
@Tag("param")
public class TestSuite {
}
