package com.braintreegateway;

/**
 * An Enum representing all of the validation errors from the gateway.
 */
public enum ValidationErrorCode {

    ADDRESS_CANNOT_BE_BLANK("81801"),
    ADDRESS_COMPANY_IS_INVALID("91821"),
    ADDRESS_COMPANY_IS_TOO_LONG("81802"),
    ADDRESS_COUNTRY_CODE_ALPHA2_IS_NOT_ACCEPTED("91814"),
    ADDRESS_COUNTRY_CODE_ALPHA3_IS_NOT_ACCEPTED("91816"),
    ADDRESS_COUNTRY_CODE_NUMERIC_IS_NOT_ACCEPTED("91817"),
    ADDRESS_COUNTRY_NAME_IS_NOT_ACCEPTED("91803"),
    ADDRESS_EXTENDED_ADDRESS_IS_INVALID("91823"),
    ADDRESS_EXTENDED_ADDRESS_IS_TOO_LONG("81804"),
    ADDRESS_FIRST_NAME_IS_INVALID("91819"),
    ADDRESS_FIRST_NAME_IS_TOO_LONG("81805"),
    ADDRESS_INCONSISTENT_COUNTRY("91815"),
    ADDRESS_IS_INVALID("91828"),
    ADDRESS_LAST_NAME_IS_INVALID("91820"),
    ADDRESS_LAST_NAME_IS_TOO_LONG("81806"),
    ADDRESS_LOCALITY_IS_INVALID("91824"),
    ADDRESS_LOCALITY_IS_TOO_LONG("81807"),
    ADDRESS_POSTAL_CODE_INVALID_CHARACTERS("81813"),
    ADDRESS_POSTAL_CODE_IS_INVALID("91826"),
    ADDRESS_POSTAL_CODE_IS_REQUIRED("81808"),
    ADDRESS_POSTAL_CODE_IS_TOO_LONG("81809"),
    ADDRESS_REGION_IS_INVALID("91825"),
    ADDRESS_REGION_IS_TOO_LONG("81810"),
    ADDRESS_STATE_IS_INVALID_FOR_SELLER_PROTECTION("81827"),
    ADDRESS_STREET_ADDRESS_IS_INVALID("91822"),
    ADDRESS_STREET_ADDRESS_IS_REQUIRED("81811"),
    ADDRESS_STREET_ADDRESS_IS_TOO_LONG("81812"),
    ADDRESS_TOO_MANY_ADDRESSES_PER_CUSTOMER("91818"),

    APPLE_PAY_CARDS_ARE_NOT_ACCEPTED("83501"),
    APPLE_PAY_CUSTOMER_ID_IS_REQUIRED_FOR_VAULTING("83502"),
    APPLE_PAY_TOKEN_IS_IN_USE("93503"),
    APPLE_PAY_PAYMENT_METHOD_NONCE_CONSUMED("93504"),
    APPLE_PAY_PAYMENT_METHOD_NONCE_UNKNOWN("93505"),
    APPLE_PAY_PAYMENT_METHOD_NONCE_LOCKED("93506"),
    APPLE_PAY_PAYMENT_METHOD_NONCE_CARD_TYPE_IS_NOT_ACCEPTED("83518"),
    APPLE_PAY_CANNOT_UPDATE_APPLE_PAY_CARD_USING_PAYMENT_METHOD_NONCE("93507"),
    APPLE_PAY_NUMBER_IS_REQUIRED("93508"),
    APPLE_PAY_EXPIRATION_MONTH_IS_REQUIRED("93509"),
    APPLE_PAY_EXPIRATION_YEAR_IS_REQUIRED("93510"),
    APPLE_PAY_CRYPTOGRAM_IS_REQUIRED("93511"),
    APPLE_PAY_DECRYPTION_FAILED("83512"),
    APPLE_PAY_DISABLED("93513"),
    APPLE_PAY_MERCHANT_NOT_CONFIGURED("93514"),
    APPLE_PAY_MERCHANT_KEYS_ALREADY_CONFIGURED("93515"),
    APPLE_PAY_MERCHANT_KEYS_NOT_CONFIGURED("93516"),
    APPLE_PAY_CERTIFICATE_INVALID("93517"),
    APPLE_PAY_CERTIFICATE_MISMATCH("93519"),
    APPLE_PAY_INVALID_TOKEN("83520"),
    APPLE_PAY_PRIVATE_KEY_MISMATCH("93521"),
    APPLE_PAY_KEY_MISMATCH_STORING_CERTIFICATE("93522"),

    AUTHORIZATION_FINGERPRINT_MISSING_FINGERPRINT("93201"),
    AUTHORIZATION_FINGERPRINT_INVALID_FORMAT("93202"),
    AUTHORIZATION_FINGERPRINT_SIGNATURE_REVOKED("93203"),
    AUTHORIZATION_FINGERPRINT_INVALID_CREATED_AT("93204"),
    AUTHORIZATION_FINGERPRINT_INVALID_PUBLIC_KEY("93205"),
    AUTHORIZATION_FINGERPRINT_INVALID_SIGNATURE("93206"),
    AUTHORIZATION_FINGERPRINT_OPTIONS_NOT_ALLOWED_WITHOUT_CUSTOMER("93207"),

    CLIENT_TOKEN_MAKE_DEFAULT_REQUIRES_CUSTOMER_ID("92801"),
    CLIENT_TOKEN_VERIFY_CARD_REQUIRES_CUSTOMER_ID("92802"),
    CLIENT_TOKEN_FAIL_ON_DUPLICATE_PAYMENT_METHOD_REQUIRES_CUSTOMER_ID("92803"),
    CLIENT_TOKEN_CUSTOMER_DOES_NOT_EXIST("92804"),
    CLIENT_TOKEN_PROXY_MERCHANT_DOES_NOT_EXIST("92805"),
    CLIENT_TOKEN_UNSUPPORTED_VERSION("92806"),
    CLIENT_TOKEN_MERCHANT_ACCOUNT_DOES_NOT_EXIST("92807"),

    CREDIT_CARD_BILLING_ADDRESS_CONFLICT("91701"),
    CREDIT_CARD_BILLING_ADDRESS_FORMAT_IS_INVALID("91744"),
    CREDIT_CARD_BILLING_ADDRESS_ID_IS_INVALID("91702"),
    CREDIT_CARD_CANNOT_UPDATE_CARD_USING_PAYMENT_METHOD_NONCE("91735"),
    CREDIT_CARD_CARDHOLDER_NAME_IS_TOO_LONG("81723"),
    CREDIT_CARD_CREDIT_CARD_TYPE_IS_NOT_ACCEPTED("81703"),
    CREDIT_CARD_CREDIT_CARD_TYPE_IS_NOT_ACCEPTED_BY_SUBSCRIPTION_MERCHANT_ACCOUNT("81718"),
    CREDIT_CARD_CUSTOMER_ID_IS_INVALID("91705"),
    CREDIT_CARD_CUSTOMER_ID_IS_REQUIRED("91704"),
    CREDIT_CARD_CVV_IS_INVALID("81707"),
    CREDIT_CARD_CVV_IS_REQUIRED("81706"),
    CREDIT_CARD_CVV_VERIFICATION_FAILED("81736"),
    CREDIT_CARD_DUPLICATE_CARD_EXISTS("81724"),
    CREDIT_CARD_EXPIRATION_DATE_CONFLICT("91708"),
    CREDIT_CARD_EXPIRATION_DATE_IS_INVALID("81710"),
    CREDIT_CARD_EXPIRATION_DATE_IS_REQUIRED("81709"),
    CREDIT_CARD_EXPIRATION_DATE_YEAR_IS_INVALID("81711"),
    CREDIT_CARD_EXPIRATION_MONTH_IS_INVALID("81712"),
    CREDIT_CARD_EXPIRATION_YEAR_IS_INVALID("81713"),
    CREDIT_CARD_INVALID_PARAMS_FOR_CREDIT_CARD_UPDATE("91745"),
    CREDIT_CARD_INVALID_VENMO_SDK_PAYMENT_METHOD_CODE("91727"),
    CREDIT_CARD_NUMBER_HAS_INVALID_LENGTH("81716"),
    CREDIT_CARD_NUMBER_IS_INVALID("81715"),
    CREDIT_CARD_NUMBER_IS_PROHIBITED("81750"),
    CREDIT_CARD_NUMBER_IS_REQUIRED("81714"),
    CREDIT_CARD_NUMBER_LENGTH_IS_INVALID("81716"),
    CREDIT_CARD_NUMBER_MUST_BE_TEST_NUMBER("81717"),
    CREDIT_CARD_OPTIONS_UPDATE_EXISTING_TOKEN_IS_INVALID("91723"),
    CREDIT_CARD_OPTIONS_UPDATE_EXISTING_TOKEN_NOT_ALLOWED("91729"),
    CREDIT_CARD_OPTIONS_VERIFICATION_AMOUNT_CANNOT_BE_NEGATIVE("91739"),
    CREDIT_CARD_OPTIONS_VERIFICATION_AMOUNT_FORMAT_IS_INVALID("91740"),
    CREDIT_CARD_OPTIONS_VERIFICATION_AMOUNT_NOT_SUPPORTED_BY_PROCESSOR("91741"),
    CREDIT_CARD_OPTIONS_VERIFICATION_MERCHANT_ACCOUNT_ID_IS_INVALID("91728"),
    CREDIT_CARD_OPTIONS_VERIFICATION_MERCHANT_ACCOUNT_IS_FORBIDDEN("91743"),
    CREDIT_CARD_OPTIONS_VERIFICATION_MERCHANT_ACCOUNT_IS_SUSPENDED("91742"),
    CREDIT_CARD_PAYMENT_METHOD_CONFLICT("81725"),
    CREDIT_CARD_PAYMENT_METHOD_IS_NOT_A_CREDIT_CARD("91738"),
    CREDIT_CARD_PAYMENT_METHOD_NONCE_CARD_TYPE_IS_NOT_ACCEPTED("91734"),
    CREDIT_CARD_PAYMENT_METHOD_NONCE_CONSUMED("91731"),
    CREDIT_CARD_PAYMENT_METHOD_NONCE_LOCKED("91733"),
    CREDIT_CARD_PAYMENT_METHOD_NONCE_UNKNOWN("91732"),
    CREDIT_CARD_POSTAL_CODE_VERIFICATION_FAILED("81737"),
    CREDIT_CARD_TOKEN_FORMAT_IS_INVALID("91718"),
    CREDIT_CARD_TOKEN_INVALID("91718"),
    CREDIT_CARD_TOKEN_IS_IN_USE("91719"),
    CREDIT_CARD_TOKEN_IS_NOT_ALLOWED("91721"),
    CREDIT_CARD_TOKEN_IS_REQUIRED("91722"),
    CREDIT_CARD_TOKEN_IS_TOO_LONG("91720"),
    CREDIT_CARD_VENMO_SDK_PAYMENT_METHOD_CODE_CARD_TYPE_IS_NOT_ACCEPTED("91726"),
    CREDIT_CARD_VERIFICATION_NOT_SUPPORTED_ON_THIS_MERCHANT_ACCOUNT("91730"),

    CUSTOMER_COMPANY_IS_TOO_LONG("81601"),
    CUSTOMER_CUSTOM_FIELD_IS_INVALID("91602"),
    CUSTOMER_CUSTOM_FIELD_IS_TOO_LONG("81603"),
    CUSTOMER_EMAIL_FORMAT_IS_INVALID("81604"),
    CUSTOMER_EMAIL_IS_INVALID("81604"),
    CUSTOMER_EMAIL_IS_REQUIRED("81606"),
    CUSTOMER_EMAIL_IS_TOO_LONG("81605"),
    CUSTOMER_FAX_IS_TOO_LONG("81607"),
    CUSTOMER_FIRST_NAME_IS_TOO_LONG("81608"),
    CUSTOMER_ID_IS_INVAILD("91610"), //Deprecated
    CUSTOMER_ID_IS_INVALID("91610"), //Deprecated
    CUSTOMER_ID_IS_IN_USE("91609"),
    CUSTOMER_ID_IS_NOT_ALLOWED("91611"),
    CUSTOMER_ID_IS_REQUIRED("91613"),
    CUSTOMER_ID_IS_TOO_LONG("91612"),
    CUSTOMER_LAST_NAME_IS_TOO_LONG("81613"),
    CUSTOMER_PHONE_IS_TOO_LONG("81614"),
    CUSTOMER_VAULTED_PAYMENT_INSTRUMENT_NONCE_BELONGS_TO_DIFFERENT_CUSTOMER("91617"),
    CUSTOMER_WEBSITE_FORMAT_IS_INVALID("81616"),
    CUSTOMER_WEBSITE_IS_INVALID("81616"),
    CUSTOMER_WEBSITE_IS_TOO_LONG("81615"),

    DESCRIPTOR_DYNAMIC_DESCRIPTORS_DISABLED("92203"),
    DESCRIPTOR_INTERNATIONAL_NAME_FORMAT_IS_INVALID("92204"),
    DESCRIPTOR_INTERNATIONAL_PHONE_FORMAT_IS_INVALID("92205"),
    DESCRIPTOR_NAME_FORMAT_IS_INVALID("92201"),
    DESCRIPTOR_PHONE_FORMAT_IS_INVALID("92202"),
    DESCRIPTOR_URL_FORMAT_IS_INVALID("92206"),

    INDUSTRY_DATA_INDUSTRY_TYPE_IS_INVALID("93401"),
    INDUSTRY_DATA_LODGING_EMPTY_DATA("93402"),
    INDUSTRY_DATA_LODGING_FOLIO_NUMBER_IS_INVALID("93403"),
    INDUSTRY_DATA_LODGING_CHECK_IN_DATE_IS_INVALID("93404"),
    INDUSTRY_DATA_LODGING_CHECK_OUT_DATE_IS_INVALID("93405"),
    INDUSTRY_DATA_LODGING_CHECK_OUT_DATE_MUST_FOLLOW_CHECK_IN_DATE("93406"),
    INDUSTRY_DATA_LODGING_UNKNOWN_DATA_FIELD("93407"),
    INDUSTRY_DATA_TRAVEL_CRUISE_EMPTY_DATA("93408"),
    INDUSTRY_DATA_TRAVEL_CRUISE_UNKNOWN_DATA_FIELD("93409"),
    INDUSTRY_DATA_TRAVEL_CRUISE_TRAVEL_PACKAGE_IS_INVALID("93410"),
    INDUSTRY_DATA_TRAVEL_CRUISE_DEPARTURE_DATE_IS_INVALID("93411"),
    INDUSTRY_DATA_TRAVEL_CRUISE_LODGING_CHECK_IN_DATE_IS_INVALID("93412"),
    INDUSTRY_DATA_TRAVEL_CRUISE_LODGING_CHECKOUT_DATE_IS_INVALID("93413"),

    OAUTH_INVALID_GRANT("93801"),
    OAUTH_INVALID_CREDENTIALS("93802"),
    OAUTH_INVALID_SCOPE("93803"),
    OAUTH_INVALID_REQUEST("93804"),
    OAUTH_UNSUPPORTED_GRANT_TYPE("93805"),

    PAYMENT_METHOD_CUSTOMER_ID_IS_INVALID("93105"),
    PAYMENT_METHOD_CUSTOMER_ID_IS_REQUIRED("93104"),
    PAYMENT_METHOD_NONCE_IS_INVALID("93102"),
    PAYMENT_METHOD_PAYMENT_METHOD_PARAMS_ARE_REQUIRED("93101"),
    PAYMENT_METHOD_PARAMS_ARE_REQUIRED("93101"),
    PAYMENT_METHOD_NONCE_IS_REQUIRED("93103"),
    PAYMENT_METHOD_CANNOT_FORWARD_PAYMENT_METHOD_TYPE("93106"),
    PAYMENT_METHOD_PAYMENT_METHOD_NONCE_CONSUMED("93107"),
    PAYMENT_METHOD_PAYMENT_METHOD_NONCE_UNKNOWN("93108"),
    PAYMENT_METHOD_PAYMENT_METHOD_NONCE_LOCKED("93109"),

    PAYPAL_ACCOUNT_AUTH_EXPIRED("92911"),
    PAYPAL_ACCOUNT_CANNOT_HAVE_BOTH_ACCESS_TOKEN_AND_CONSENT_CODE("82903"),
    PAYPAL_ACCOUNT_CANNOT_HAVE_FUNDING_SOURCE_WITHOUT_ACCESS_TOKEN("92912"),
    PAYPAL_ACCOUNT_CANNOT_UPDATE_PAYPAL_ACCOUNT_USING_PAYMENT_METHOD_NONCE("92914"),
    PAYPAL_ACCOUNT_CANNOT_VAULT_ONE_TIME_USE_PAYPAL_ACCOUNT("82902"),
    PAYPAL_ACCOUNT_CONSENT_CODE_OR_ACCESS_TOKEN_IS_REQUIRED("82901"),
    PAYPAL_ACCOUNT_CUSTOMER_ID_IS_REQUIRED_FOR_VAULTING("82905"),
    PAYPAL_ACCOUNT_INVALID_FUNDING_SOURCE_SELECTION("92913"),
    PAYPAL_ACCOUNT_INVALID_PARAMS_FOR_PAYPAL_ACCOUNT_UPDATE("92915"),
    PAYPAL_ACCOUNT_PAYMENT_METHOD_NONCE_CONSUMED("92907"),
    PAYPAL_ACCOUNT_PAYMENT_METHOD_NONCE_LOCKED("92909"),
    PAYPAL_ACCOUNT_PAYMENT_METHOD_NONCE_UNKNOWN("92908"),
    PAYPAL_ACCOUNT_PAYPAL_ACCOUNTS_ARE_NOT_ACCEPTED("82904"),
    PAYPAL_ACCOUNT_PAYPAL_COMMUNICATION_ERROR("92910"),
    PAYPAL_ACCOUNT_TOKEN_IS_IN_USE("92906"),

    EUROPE_BANK_ACCOUNT_ACCOUNT_HOLDER_NAME_IS_REQUIRED("93003"),
    EUROPE_BANK_ACCOUNT_BIC_IS_REQUIRED("93002"),
    EUROPE_BANK_ACCOUNT_IBAN_IS_REQUIRED("93001"),

    SEPA_MANDATE_ACCOUNT_HOLDER_NAME_IS_REQUIRED("83301"),
    SEPA_MANDATE_BIC_INVALID_CHARACTER("83306"),
    SEPA_MANDATE_BIC_IS_REQUIRED("83302"),
    SEPA_MANDATE_BIC_LENGTH_IS_INVALID("83307"),
    SEPA_MANDATE_BIC_UNSUPPORTED_COUNTRY("83308"),
    SEPA_MANDATE_BILLING_ADDRESS_CONFLICT("93311"),
    SEPA_MANDATE_BILLING_ADDRESS_ID_IS_INVALID("93312"),
    SEPA_MANDATE_IBAN_INVALID_CHARACTER("83305"),
    SEPA_MANDATE_IBAN_INVALID_FORMAT("83310"),
    SEPA_MANDATE_IBAN_IS_REQUIRED("83303"),
    SEPA_MANDATE_IBAN_UNSUPPORTED_COUNTRY("83309"),
    SEPA_MANDATE_TYPE_IS_REQUIRED("93304"),
    SEPA_MANDATE_TYPE_IS_INVALID("93313"),

    SETTLEMENT_BATCH_SUMMARY_SETTLEMENT_DATE_IS_INVALID("82302"),
    SETTLEMENT_BATCH_SUMMARY_SETTLEMENT_DATE_IS_REQUIRED("82301"),
    SETTLEMENT_BATCH_SUMMARY_CUSTOM_FIELD_IS_INVALID("82303"),

    SUBSCRIPTION_BILLING_DAY_OF_MONTH_CANNOT_BE_UPDATED("91918"),
    SUBSCRIPTION_BILLING_DAY_OF_MONTH_IS_INVALID("91914"),
    SUBSCRIPTION_BILLING_DAY_OF_MONTH_MUST_BE_NUMERIC("91913"),
    SUBSCRIPTION_CANNOT_ADD_DUPLICATE_ADDON_OR_DISCOUNT("91911"),
    SUBSCRIPTION_CANNOT_EDIT_CANCELED_SUBSCRIPTION("81901"),
    SUBSCRIPTION_CANNOT_EDIT_EXPIRED_SUBSCRIPTION("81910"),
    SUBSCRIPTION_CANNOT_EDIT_PRICE_CHANGING_FIELDS_ON_PAST_DUE_SUBSCRIPTION("91920"),
    SUBSCRIPTION_FIRST_BILLING_DATE_CANNOT_BE_IN_THE_PAST("91916"),
    SUBSCRIPTION_FIRST_BILLING_DATE_CANNOT_BE_UPDATED("91919"),
    SUBSCRIPTION_FIRST_BILLING_DATE_IS_INVALID("91915"),
    SUBSCRIPTION_ID_IS_IN_USE("81902"),
    SUBSCRIPTION_INCONSISTENT_NUMBER_OF_BILLING_CYCLES("91908"),
    SUBSCRIPTION_INCONSISTENT_START_DATE("91917"),
    SUBSCRIPTION_INVALID_REQUEST_FORMAT("91921"),
    SUBSCRIPTION_MERCHANT_ACCOUNT_DOES_NOT_SUPPORT_INSTRUMENT_TYPE("91930"),
    SUBSCRIPTION_MERCHANT_ACCOUNT_ID_IS_INVALID("91901"),
    SUBSCRIPTION_MISMATCH_CURRENCY_ISO_CODE("91923"),
    SUBSCRIPTION_MODIFICATION_ID_TO_REMOVE_IS_INVALID("92025"),
    SUBSCRIPTION_NUMBER_OF_BILLING_CYCLES_CANNOT_BE_BLANK("91912"),
    SUBSCRIPTION_NUMBER_OF_BILLING_CYCLES_IS_TOO_SMALL("91909"),
    SUBSCRIPTION_NUMBER_OF_BILLING_CYCLES_MUST_BE_GREATER_THAN_ZERO("91907"),
    SUBSCRIPTION_NUMBER_OF_BILLING_CYCLES_MUST_BE_NUMERIC("91906"),
    SUBSCRIPTION_PAYMENT_METHOD_NONCE_CARD_TYPE_IS_NOT_ACCEPTED("91924"),
    SUBSCRIPTION_PAYMENT_METHOD_NONCE_INSTRUMENT_TYPE_DOES_NOT_SUPPORT_SUBSCRIPTIONS("91929"),
    SUBSCRIPTION_PAYMENT_METHOD_NONCE_IS_INVALID("91925"),
    SUBSCRIPTION_PAYMENT_METHOD_NONCE_NOT_ASSOCIATED_WITH_CUSTOMER("91926"),
    SUBSCRIPTION_PAYMENT_METHOD_NONCE_UNVAULTED_CARD_IS_NOT_ACCEPTED("91927"),
    SUBSCRIPTION_PAYMENT_METHOD_TOKEN_CARD_TYPE_IS_NOT_ACCEPTED("91902"),
    SUBSCRIPTION_PAYMENT_METHOD_TOKEN_INSTRUMENT_TYPE_DOES_NOT_SUPPORT_SUBSCRIPTIONS("91928"),
    SUBSCRIPTION_PAYMENT_METHOD_TOKEN_IS_INVALID("91903"),
    SUBSCRIPTION_PAYMENT_METHOD_TOKEN_NOT_ASSOCIATED_WITH_CUSTOMER("91905"),
    SUBSCRIPTION_PLAN_BILLING_FREQUENCY_CANNOT_BE_UPDATED("91922"),
    SUBSCRIPTION_PLAN_ID_IS_INVALID("91904"),
    SUBSCRIPTION_PRICE_CANNOT_BE_BLANK("81903"),
    SUBSCRIPTION_PRICE_FORMAT_IS_INVALID("81904"),
    SUBSCRIPTION_PRICE_IS_TOO_LARGE("81923"),
    SUBSCRIPTION_STATUS_IS_CANCELED("81905"),
    SUBSCRIPTION_TOKEN_FORMAT_IS_INVALID("81906"),
    SUBSCRIPTION_TRIAL_DURATION_FORMAT_IS_INVALID("81907"),
    SUBSCRIPTION_TRIAL_DURATION_IS_REQUIRED("81908"),
    SUBSCRIPTION_TRIAL_DURATION_UNIT_IS_INVALID("81909"),

    SUBSCRIPTION_MODIFICATION_AMOUNT_CANNOT_BE_BLANK("92003"),
    SUBSCRIPTION_MODIFICATION_AMOUNT_IS_INVALID("92002"),
    SUBSCRIPTION_MODIFICATION_AMOUNT_IS_TOO_LARGE("92023"),
    SUBSCRIPTION_MODIFICATION_CANNOT_EDIT_MODIFICATIONS_ON_PAST_DUE_SUBSCRIPTION("92022"),
    SUBSCRIPTION_MODIFICATION_CANNOT_UPDATE_AND_REMOVE("92015"),
    SUBSCRIPTION_MODIFICATION_EXISTING_ID_IS_INCORRECT_KIND("92020"),
    SUBSCRIPTION_MODIFICATION_EXISTING_ID_IS_INVALID("92011"),
    SUBSCRIPTION_MODIFICATION_EXISTING_ID_IS_REQUIRED("92012"),
    SUBSCRIPTION_MODIFICATION_ID_TO_REMOVE_IS_INCORRECT_KIND("92021"),
    SUBSCRIPTION_MODIFICATION_ID_TO_REMOVE_IS_NOT_PRESENT("92016"),
    SUBSCRIPTION_MODIFICATION_INCONSISTENT_NUMBER_OF_BILLING_CYCLES("92018"),
    SUBSCRIPTION_MODIFICATION_INHERITED_FROM_ID_IS_INVALID("92013"),
    SUBSCRIPTION_MODIFICATION_INHERITED_FROM_ID_IS_REQUIRED("92014"),
    SUBSCRIPTION_MODIFICATION_MISSING("92024"),
    SUBSCRIPTION_MODIFICATION_NUMBER_OF_BILLING_CYCLES_CANNOT_BE_BLANK("92017"),
    SUBSCRIPTION_MODIFICATION_NUMBER_OF_BILLING_CYCLES_IS_INVALID("92005"),
    SUBSCRIPTION_MODIFICATION_NUMBER_OF_BILLING_CYCLES_MUST_BE_GREATER_THAN_ZERO("92019"),
    SUBSCRIPTION_MODIFICATION_QUANTITY_CANNOT_BE_BLANK("92004"),
    SUBSCRIPTION_MODIFICATION_QUANTITY_IS_INVALID("92001"),
    SUBSCRIPTION_MODIFICATION_QUANTITY_MUST_BE_GREATER_THAN_ZERO("92010"),

    TRANSACTION_AMOUNT_CANNOT_BE_NEGATIVE("81501"),
    TRANSACTION_AMOUNT_DOES_NOT_MATCH3_D_SECURE_AMOUNT("91585"),
    TRANSACTION_AMOUNT_FORMAT_IS_INVALID("81503"),
    TRANSACTION_AMOUNT_IS_INVALID("81503"),
    TRANSACTION_AMOUNT_IS_REQUIRED("81502"),
    TRANSACTION_AMOUNT_IS_TOO_LARGE("81528"),
    TRANSACTION_AMOUNT_MUST_BE_GREATER_THAN_ZERO("81531"),
    TRANSACTION_BILLING_ADDRESS_CONFLICT("91530"),
    TRANSACTION_CANNOT_BE_VOIDED("91504"),
    TRANSACTION_CANNOT_CANCEL_RELEASE("91562"),
    TRANSACTION_CANNOT_CLONE_CREDIT("91543"),
    TRANSACTION_CANNOT_CLONE_TRANSACTION_WITH_PAYPAL_ACCOUNT("91573"),
    TRANSACTION_CANNOT_CLONE_TRANSACTION_WITH_VAULT_CREDIT_CARD("91540"),
    TRANSACTION_CANNOT_CLONE_UNSUCCESSFUL_TRANSACTION("91542"),
    TRANSACTION_CANNOT_CLONE_VOICE_AUTHORIZATIONS("91541"),
    TRANSACTION_CANNOT_HOLD_IN_ESCROW("91560"),
    TRANSACTION_CANNOT_PARTIALLY_REFUND_ESCROWED_TRANSACTION("91563"),
    TRANSACTION_CANNOT_REFUND_CREDIT("91505"),
    TRANSACTION_CANNOT_REFUND_SETTLING_TRANSACTION("91574"),
    TRANSACTION_CANNOT_REFUND_UNLESS_SETTLED("91506"),
    TRANSACTION_CANNOT_REFUND_WITH_PENDING_MERCHANT_ACCOUNT("91559"),
    TRANSACTION_CANNOT_REFUND_WITH_SUSPENDED_MERCHANT_ACCOUNT("91538"),
    TRANSACTION_CANNOT_RELEASE_FROM_ESCROW("91561"),
    TRANSACTION_CANNOT_SUBMIT_FOR_PARTIAL_SETTLEMENT("915103"),
    TRANSACTION_CANNOT_SUBMIT_FOR_SETTLEMENT("91507"),
    TRANSACTION_CANNOT_UPDATE_DETAILS_NOT_SUBMITTED_FOR_SETTLEMENT("915129"),
    TRANSACTION_CHANNEL_IS_TOO_LONG("91550"),
    TRANSACTION_CREDIT_CARD_IS_REQUIRED("91508"),
    TRANSACTION_CUSTOMER_DEFAULT_PAYMENT_METHOD_CARD_TYPE_IS_NOT_ACCEPTED("81509"),
    TRANSACTION_CUSTOMER_DOES_NOT_HAVE_CREDIT_CARD("91511"),
    TRANSACTION_CUSTOMER_ID_IS_INVALID("91510"),
    TRANSACTION_CUSTOM_FIELD_IS_INVALID("91526"),
    TRANSACTION_CUSTOM_FIELD_IS_TOO_LONG("81527"),
    TRANSACTION_HAS_ALREADY_BEEN_REFUNDED("91512"),
    TRANSACTION_MERCHANT_ACCOUNT_DOES_NOT_MATCH3_D_SECURE_MERCHANT_ACCOUNT("91584"),
    TRANSACTION_MERCHANT_ACCOUNT_DOES_NOT_SUPPORT_MOTO("91558"),
    TRANSACTION_MERCHANT_ACCOUNT_DOES_NOT_SUPPORT_REFUNDS("91547"),
    TRANSACTION_MERCHANT_ACCOUNT_ID_IS_INVALID("91513"),
    TRANSACTION_MERCHANT_ACCOUNT_IS_SUSPENDED("91514"),
    TRANSACTION_MERCHANT_ACCOUNT_NAME_IS_INVALID("91513"), //Deprecated
    TRANSACTION_OPTIONS_PAY_PAL_CUSTOM_FIELD_TOO_LONG("91580"),
    TRANSACTION_OPTIONS_SUBMIT_FOR_SETTLEMENT_IS_REQUIRED_FOR_CLONING("91544"),
    TRANSACTION_OPTIONS_SUBMIT_FOR_SETTLEMENT_IS_REQUIRED_FOR_PAYPAL_UNILATERAL("91582"),
    TRANSACTION_OPTIONS_USE_BILLING_FOR_SHIPPING_DISABLED("91572"),
    TRANSACTION_OPTIONS_VAULT_IS_DISABLED("91525"),
    TRANSACTION_ORDER_ID_IS_TOO_LONG("91501"),
    TRANSACTION_PAYMENT_INSTRUMENT_NOT_SUPPORTED_BY_MERCHANT_ACCOUNT("91577"),
    TRANSACTION_PAYMENT_INSTRUMENT_TYPE_IS_NOT_ACCEPTED("915101"),
    TRANSACTION_PAYMENT_METHOD_CONFLICT("91515"),
    TRANSACTION_PAYMENT_METHOD_CONFLICT_WITH_VENMO_SDK("91549"),
    TRANSACTION_PAYMENT_METHOD_DOES_NOT_BELONG_TO_CUSTOMER("91516"),
    TRANSACTION_PAYMENT_METHOD_DOES_NOT_BELONG_TO_SUBSCRIPTION("91527"),
    TRANSACTION_PAYMENT_METHOD_NONCE_CARD_TYPE_IS_NOT_ACCEPTED("91567"),
    TRANSACTION_PAYMENT_METHOD_NONCE_CONSUMED("91564"),
    TRANSACTION_PAYMENT_METHOD_NONCE_HAS_NO_VALID_PAYMENT_INSTRUMENT_TYPE("91569"),
    TRANSACTION_PAYMENT_METHOD_NONCE_LOCKED("91566"),
    TRANSACTION_PAYMENT_METHOD_NONCE_UNKNOWN("91565"),
    TRANSACTION_PAYMENT_METHOD_TOKEN_CARD_TYPE_IS_NOT_ACCEPTED("91517"),
    TRANSACTION_PAYMENT_METHOD_TOKEN_IS_INVALID("91518"),
    TRANSACTION_PAYPAL_NOT_ENABLED("91576"),
    TRANSACTION_PAY_PAL_AUTH_EXPIRED("91579"),
    TRANSACTION_PAY_PAL_VAULT_RECORD_MISSING_DATA("91583"),
    TRANSACTION_PROCESSOR_AUTHORIZATION_CODE_CANNOT_BE_SET("91519"),
    TRANSACTION_PROCESSOR_AUTHORIZATION_CODE_IS_INVALID("81520"),
    TRANSACTION_PROCESSOR_DOES_NOT_SUPPORT_AUTHS("915104"),
    TRANSACTION_PROCESSOR_DOES_NOT_SUPPORT_CREDITS("91546"),
    TRANSACTION_PROCESSOR_DOES_NOT_SUPPORT_PARTIAL_SETTLEMENT("915102"),
    TRANSACTION_PROCESSOR_DOES_NOT_SUPPORT_UPDATING_DESCRIPTOR("915108"),
    TRANSACTION_PROCESSOR_DOES_NOT_SUPPORT_UPDATING_ORDER_ID("915107"),
    TRANSACTION_PROCESSOR_DOES_NOT_SUPPORT_UPDATING_DETAILS("915130"),
    TRANSACTION_PROCESSOR_DOES_NOT_SUPPORT_VOICE_AUTHORIZATIONS("91545"),
    TRANSACTION_PURCHASE_ORDER_NUMBER_IS_INVALID("91548"),
    TRANSACTION_PURCHASE_ORDER_NUMBER_IS_TOO_LONG("91537"),
    TRANSACTION_REFUND_AMOUNT_IS_TOO_LARGE("91521"),
    TRANSACTION_SERVICE_FEE_AMOUNT_CANNOT_BE_NEGATIVE("91554"),
    TRANSACTION_SERVICE_FEE_AMOUNT_FORMAT_IS_INVALID("91555"),
    TRANSACTION_SERVICE_FEE_AMOUNT_IS_TOO_LARGE("91556"),
    TRANSACTION_SERVICE_FEE_AMOUNT_NOT_ALLOWED_ON_MASTER_MERCHANT_ACCOUNT("91557"),
    TRANSACTION_SERVICE_FEE_IS_NOT_ALLOWED_ON_CREDITS("91552"),
    TRANSACTION_SERVICE_FEE_NOT_ACCEPTED_FOR_PAYPAL("91578"),
    TRANSACTION_SETTLEMENT_AMOUNT_IS_LESS_THAN_SERVICE_FEE_AMOUNT("91551"),
    TRANSACTION_SETTLEMENT_AMOUNT_IS_TOO_LARGE("91522"),
    TRANSACTION_SHIPPING_ADDRESS_DOESNT_MATCH_CUSTOMER("91581"),
    TRANSACTION_SUBSCRIPTION_DOES_NOT_BELONG_TO_CUSTOMER("91529"),
    TRANSACTION_SUBSCRIPTION_ID_IS_INVALID("91528"),
    TRANSACTION_SUBSCRIPTION_STATUS_MUST_BE_PAST_DUE("91531"),
    TRANSACTION_SUB_MERCHANT_ACCOUNT_REQUIRES_SERVICE_FEE_AMOUNT("91553"),
    TRANSACTION_TAX_AMOUNT_CANNOT_BE_NEGATIVE("81534"),
    TRANSACTION_TAX_AMOUNT_FORMAT_IS_INVALID("81535"),
    TRANSACTION_TAX_AMOUNT_IS_TOO_LARGE("81536"),

    TRANSACTION_THREE_D_SECURE_AUTHENTICATION_FAILED("81571"),
    TRANSACTION_THREE_D_SECURE_TOKEN_IS_INVALID("91568"),
    TRANSACTION_THREE_D_SECURE_TRANSACTION_DATA_DOESNT_MATCH_VERIFY("91570"),

    TRANSACTION_TYPE_IS_INVALID("91523"),
    TRANSACTION_TYPE_IS_REQUIRED("91524"),
    TRANSACTION_UNSUPPORTED_VOICE_AUTHORIZATION("91539"),

    TRANSACTION_CANNOT_SIMULATE_SETTLEMENT("91575"),

    VERIFICATION_OPTIONS_AMOUNT_CANNOT_BE_NEGATIVE("94201"),
    VERIFICATION_OPTIONS_AMOUNT_FORMAT_IS_INVALID("94202"),
    VERIFICATION_OPTIONS_AMOUNT_NOT_SUPPORTED_BY_PROCESSOR("94203"),
    VERIFICATION_OPTIONS_MERCHANT_ACCOUNT_ID_IS_INVALID("94204"),
    VERIFICATION_OPTIONS_MERCHANT_ACCOUNT_IS_SUSPENDED("94205"),
    VERIFICATION_OPTIONS_MERCHANT_ACCOUNT_IS_FORBIDDEN("94206"),

    MERCHANT_ACCOUNT_CANNOT_BE_UPDATED("82674"),
    MERCHANT_ACCOUNT_DECLINED("82626"),
    MERCHANT_ACCOUNT_DECLINED_FAILED_KYC("82623"),
    MERCHANT_ACCOUNT_DECLINED_MASTER_CARD_MATCH("82622"),
    MERCHANT_ACCOUNT_DECLINED_OFAC("82621"),
    MERCHANT_ACCOUNT_DECLINED_SSN_INVALID("82624"),
    MERCHANT_ACCOUNT_DECLINED_SSN_MATCHES_DECEASED("82625"),
    MERCHANT_ACCOUNT_ID_CANNOT_BE_UPDATED("82675"),
    MERCHANT_ACCOUNT_ID_FORMAT_IS_INVALID("82603"),
    MERCHANT_ACCOUNT_ID_IS_IN_USE("82604"),
    MERCHANT_ACCOUNT_ID_IS_NOT_ALLOWED("82605"),
    MERCHANT_ACCOUNT_ID_IS_TOO_LONG("82602"),
    MERCHANT_ACCOUNT_MASTER_MERCHANT_ACCOUNT_ID_CANNOT_BE_UPDATED("82676"),
    MERCHANT_ACCOUNT_MASTER_MERCHANT_ACCOUNT_ID_IS_INVALID("82607"),
    MERCHANT_ACCOUNT_MASTER_MERCHANT_ACCOUNT_ID_IS_REQUIRED("82606"),
    MERCHANT_ACCOUNT_MASTER_MERCHANT_ACCOUNT_MUST_BE_ACTIVE("82608"),
    MERCHANT_ACCOUNT_TOS_ACCEPTED_IS_REQUIRED("82610"),

    MERCHANT_ACCOUNT_APPLICANT_DETAILS_ACCOUNT_NUMBER_IS_REQUIRED("82614"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_COMPANY_NAME_IS_INVALID("82631"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_COMPANY_NAME_IS_REQUIRED_WITH_TAX_ID("82633"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_DATE_OF_BIRTH_IS_REQUIRED("82612"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_EMAIL_ADDRESS_IS_INVALID("82616"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_FIRST_NAME_IS_INVALID("82627"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_FIRST_NAME_IS_REQUIRED("82609"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_LAST_NAME_IS_INVALID("82628"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_LAST_NAME_IS_REQUIRED("82611"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_PHONE_IS_INVALID("82636"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_ROUTING_NUMBER_IS_INVALID("82635"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_ROUTING_NUMBER_IS_REQUIRED("82613"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_SSN_IS_INVALID("82615"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_TAX_ID_IS_INVALID("82632"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_TAX_ID_IS_REQUIRED_WITH_COMPANY_NAME("82634"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_DATE_OF_BIRTH_IS_INVALID("82663"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_ACCOUNT_NUMBER_IS_INVALID("82670"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_EMAIL_ADDRESS_IS_REQUIRED("82665"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_TAX_ID_MUST_BE_BLANK("82673"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_ADDRESS_REGION_IS_INVALID("82664"),

    MERCHANT_ACCOUNT_APPLICANT_DETAILS_ADDRESS_LOCALITY_IS_REQUIRED("82618"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_ADDRESS_POSTAL_CODE_IS_INVALID("82630"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_ADDRESS_POSTAL_CODE_IS_REQUIRED("82619"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_ADDRESS_REGION_IS_REQUIRED("82620"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_ADDRESS_STREET_ADDRESS_IS_INVALID("82629"),
    MERCHANT_ACCOUNT_APPLICANT_DETAILS_ADDRESS_STREET_ADDRESS_IS_REQUIRED("82617"),

    MERCHANT_ACCOUNT_BUSINESS_LEGAL_NAME_IS_INVALID("82677"),
    MERCHANT_ACCOUNT_BUSINESS_DBA_NAME_IS_INVALID("82646"),
    MERCHANT_ACCOUNT_BUSINESS_TAX_ID_IS_INVALID("82647"),
    MERCHANT_ACCOUNT_BUSINESS_LEGAL_NAME_IS_REQUIRED_WITH_TAX_ID("82669"),
    MERCHANT_ACCOUNT_BUSINESS_TAX_ID_IS_REQUIRED_WITH_LEGAL_NAME("82648"),
    MERCHANT_ACCOUNT_BUSINESS_TAX_ID_MUST_BE_BLANK("82672"),

    MERCHANT_ACCOUNT_BUSINESS_ADDRESS_REGION_IS_INVALID("82684"),
    MERCHANT_ACCOUNT_BUSINESS_ADDRESS_STREET_ADDRESS_IS_INVALID("82685"),
    MERCHANT_ACCOUNT_BUSINESS_ADDRESS_POSTAL_CODE_IS_INVALID("82686"),

    MERCHANT_ACCOUNT_FUNDING_ROUTING_NUMBER_IS_REQUIRED("82640"),
    MERCHANT_ACCOUNT_FUNDING_ACCOUNT_NUMBER_IS_REQUIRED("82641"),
    MERCHANT_ACCOUNT_FUNDING_ACCOUNT_NUMBER_IS_INVALID("82671"),
    MERCHANT_ACCOUNT_FUNDING_ROUTING_NUMBER_IS_INVALID("82649"),
    MERCHANT_ACCOUNT_FUNDING_DESTINATION_IS_REQUIRED("82678"),
    MERCHANT_ACCOUNT_FUNDING_DESTINATION_IS_INVALID("82679"),
    MERCHANT_ACCOUNT_FUNDING_EMAIL_IS_REQUIRED("82680"),
    MERCHANT_ACCOUNT_FUNDING_EMAIL_IS_INVALID("82681"),
    MERCHANT_ACCOUNT_FUNDING_MOBILE_PHONE_IS_REQUIRED("82682"),
    MERCHANT_ACCOUNT_FUNDING_MOBILE_PHONE_IS_INVALID("82683"),

    MERCHANT_ACCOUNT_INDIVIDUAL_FIRST_NAME_IS_REQUIRED("82637"),
    MERCHANT_ACCOUNT_INDIVIDUAL_LAST_NAME_IS_REQUIRED("82638"),
    MERCHANT_ACCOUNT_INDIVIDUAL_DATE_OF_BIRTH_IS_REQUIRED("82639"),
    MERCHANT_ACCOUNT_INDIVIDUAL_DATE_OF_BIRTH_IS_INVALID("82666"),
    MERCHANT_ACCOUNT_INDIVIDUAL_SSN_IS_INVALID("82642"),
    MERCHANT_ACCOUNT_INDIVIDUAL_EMAIL_IS_INVALID("82643"),
    MERCHANT_ACCOUNT_INDIVIDUAL_EMAIL_IS_REQUIRED("82667"),
    MERCHANT_ACCOUNT_INDIVIDUAL_FIRST_NAME_IS_INVALID("82644"),
    MERCHANT_ACCOUNT_INDIVIDUAL_LAST_NAME_IS_INVALID("82645"),
    MERCHANT_ACCOUNT_INDIVIDUAL_PHONE_IS_INVALID("82656"),

    MERCHANT_ACCOUNT_INDIVIDUAL_ADDRESS_STREET_ADDRESS_IS_REQUIRED("82657"),
    MERCHANT_ACCOUNT_INDIVIDUAL_ADDRESS_LOCALITY_IS_REQUIRED("82658"),
    MERCHANT_ACCOUNT_INDIVIDUAL_ADDRESS_POSTAL_CODE_IS_REQUIRED("82659"),
    MERCHANT_ACCOUNT_INDIVIDUAL_ADDRESS_REGION_IS_REQUIRED("82660"),
    MERCHANT_ACCOUNT_INDIVIDUAL_ADDRESS_REGION_IS_INVALID("82668"),
    MERCHANT_ACCOUNT_INDIVIDUAL_ADDRESS_STREET_ADDRESS_IS_INVALID("82661"),
    MERCHANT_ACCOUNT_INDIVIDUAL_ADDRESS_POSTAL_CODE_IS_INVALID("82662"),

    MERCHANT_EMAIL_IS_REQUIRED("83601"),
    MERCHANT_EMAIL_FORMAT_IS_INVALID("93602"),
    MERCHANT_COUNTRY_CANNOT_BE_BLANK("83603"),
    MERCHANT_COUNTRY_CODE_ALPHA3_IS_NOT_ACCEPTED("93604"),
    MERCHANT_COUNTRY_CODE_ALPHA3_IS_INVALID("93605"),
    MERCHANT_COUNTRY_CODE_ALPHA2_IS_NOT_ACCEPTED("93606"),
    MERCHANT_COUNTRY_CODE_ALPHA2_IS_INVALID("93607"),
    MERCHANT_COUNTRY_CODE_NUMERIC_IS_NOT_ACCEPTED("93608"),
    MERCHANT_COUNTRY_CODE_NUMERIC_IS_INVALID("93609"),
    MERCHANT_COUNTRY_NAME_IS_NOT_ACCEPTED("93610"),
    MERCHANT_COUNTRY_NAME_IS_INVALID("93611"),
    MERCHANT_CURRENCIES_ARE_INVALID("93614"),
    MERCHANT_INCONSISTENT_COUNTRY("93612"),
    MERCHANT_PAYMENT_METHODS_ARE_INVALID("93613"),
    MERCHANT_PAYMENT_METHODS_ARE_NOT_ALLOWED("93615"),
    @Deprecated
    UNKOWN_VALIDATION_ERROR("");

    public String code;

    private ValidationErrorCode(String code) {
        this.code = code;
    }

    public static ValidationErrorCode findByCode(String code) {
        for (ValidationErrorCode validationErrorCode : values()) {
            if (validationErrorCode.code.equals(code)) {
                return validationErrorCode;
            }
        }
        return UNKOWN_VALIDATION_ERROR;
    }

}
