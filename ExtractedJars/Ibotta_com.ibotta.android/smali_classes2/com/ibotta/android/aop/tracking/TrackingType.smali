.class public final enum Lcom/ibotta/android/aop/tracking/TrackingType;
.super Ljava/lang/Enum;
.source "TrackingType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/aop/tracking/TrackingType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum AVAILABLE_AT_RETAILER_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum BGC_PAY_AT_RETAILER:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum BOTTOM_NAV:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum CHANGED_PREFERENCE:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum CONNECTION_LOST:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum DEAD_END_BONUS:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum DEAD_END_SEARCH:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum ENGAGEMENT_COMPLETE:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum ENGAGEMENT_START:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum GENERIC:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum IM_ACCOUNT_CREATE_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum IM_ACCOUNT_LOGIN_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum IM_ACCOUNT_LOGIN_VIEWED:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum IM_CHECK_FOR_REWARDS:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum IM_CONNECTION_ISSUE:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum IM_SHARE_HISTORY:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum IM_TERMS_AGREE:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum IM_TERMS_CANCEL:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum LAUNCH_PARTNER_APP:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum LOAD_TIME:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum NO_OP:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum OFFER_DEAD_END:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum OFFER_RETAILER_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum OFFER_SHARE:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PAGE_VIEW:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_ADD_PAYMENT_METHOD:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_CONFIRM_PAYMENT_CANCELLED:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_COPY_BARCODE_NUMBER:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_ERRORS:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_HELP:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_MANAGE_TRANSACTIONS:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_MANAGE_TRANSACTION_ACTION:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_ONBOARDING_CLOSE:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_ONBOARDING_NEXT:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_ORDER_SUCCESSFULLY_COMPLETE:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_PAY_AT_RETAILER:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_RETAILER_TRANSACTIONS:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_REVEAL_CARD_NUMBER:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_SPENT_TOGGLE:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_START_EARNING:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_SUBMIT_ORDER:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum PWI_TERMS_AND_CONDITIONS:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum RECEIPT_OFFER_DIFF:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum REDEEM_PATH_HEADER:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum REDEEM_PATH_MCOMM_SHOP:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum RETAILER_BOTTOM_NAV:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum SCANNED_BARCODE:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum SPOTLIGHT_VIEW:Lcom/ibotta/android/aop/tracking/TrackingType;

.field public static final enum UNLOCK_OFFER:Lcom/ibotta/android/aop/tracking/TrackingType;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 4
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "AVAILABLE_AT_RETAILER_CLICKED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->AVAILABLE_AT_RETAILER_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 5
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "BGC_PAY_AT_RETAILER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->BGC_PAY_AT_RETAILER:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 6
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "BOTTOM_NAV"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->BOTTOM_NAV:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 7
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "CHANGED_PREFERENCE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->CHANGED_PREFERENCE:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 8
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "CONNECTION_LOST"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->CONNECTION_LOST:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 9
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "DEAD_END_BONUS"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->DEAD_END_BONUS:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 10
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "DEAD_END_SEARCH"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->DEAD_END_SEARCH:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 11
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "ENGAGEMENT_COMPLETE"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->ENGAGEMENT_COMPLETE:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 12
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "ENGAGEMENT_START"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->ENGAGEMENT_START:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 13
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "GENERIC"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->GENERIC:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 14
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "IM_ACCOUNT_LOGIN_VIEWED"

    const/16 v12, 0xa

    invoke-direct {v0, v1, v12}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_ACCOUNT_LOGIN_VIEWED:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 15
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "IM_ACCOUNT_LOGIN_CLICKED"

    const/16 v13, 0xb

    invoke-direct {v0, v1, v13}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_ACCOUNT_LOGIN_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 16
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "IM_ACCOUNT_CREATE_CLICKED"

    const/16 v14, 0xc

    invoke-direct {v0, v1, v14}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_ACCOUNT_CREATE_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 17
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "IM_TERMS_CANCEL"

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_TERMS_CANCEL:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 18
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "IM_TERMS_AGREE"

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_TERMS_AGREE:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 19
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "IM_CONNECTION_ISSUE"

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_CONNECTION_ISSUE:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 20
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "IM_CHECK_FOR_REWARDS"

    const/16 v15, 0x10

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_CHECK_FOR_REWARDS:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 21
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "IM_SHARE_HISTORY"

    const/16 v15, 0x11

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_SHARE_HISTORY:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 22
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "LAUNCH_PARTNER_APP"

    const/16 v15, 0x12

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->LAUNCH_PARTNER_APP:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 23
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "LOAD_TIME"

    const/16 v15, 0x13

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->LOAD_TIME:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 24
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "NO_OP"

    const/16 v15, 0x14

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->NO_OP:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 25
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "OFFER_SHARE"

    const/16 v15, 0x15

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->OFFER_SHARE:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 26
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "OFFER_DEAD_END"

    const/16 v15, 0x16

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->OFFER_DEAD_END:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 27
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "OFFER_RETAILER_CLICKED"

    const/16 v15, 0x17

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->OFFER_RETAILER_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 28
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PAGE_VIEW"

    const/16 v15, 0x18

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PAGE_VIEW:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 29
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_ADD_PAYMENT_METHOD"

    const/16 v15, 0x19

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ADD_PAYMENT_METHOD:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 30
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_CONFIRM_PAYMENT_CANCELLED"

    const/16 v15, 0x1a

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_CONFIRM_PAYMENT_CANCELLED:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 31
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_COPY_BARCODE_NUMBER"

    const/16 v15, 0x1b

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_COPY_BARCODE_NUMBER:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 32
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_ERRORS"

    const/16 v15, 0x1c

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ERRORS:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 33
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_HELP"

    const/16 v15, 0x1d

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_HELP:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 34
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_MANAGE_TRANSACTION_ACTION"

    const/16 v15, 0x1e

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_MANAGE_TRANSACTION_ACTION:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 35
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_MANAGE_TRANSACTIONS"

    const/16 v15, 0x1f

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_MANAGE_TRANSACTIONS:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 36
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_ONBOARDING_NEXT"

    const/16 v15, 0x20

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ONBOARDING_NEXT:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 37
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_ONBOARDING_CLOSE"

    const/16 v15, 0x21

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ONBOARDING_CLOSE:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 38
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_ORDER_SUCCESSFULLY_COMPLETE"

    const/16 v15, 0x22

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ORDER_SUCCESSFULLY_COMPLETE:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 39
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_PAY_AT_RETAILER"

    const/16 v15, 0x23

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_PAY_AT_RETAILER:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 40
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_RETAILER_TRANSACTIONS"

    const/16 v15, 0x24

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_RETAILER_TRANSACTIONS:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 41
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_REVEAL_CARD_NUMBER"

    const/16 v15, 0x25

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_REVEAL_CARD_NUMBER:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 42
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_SPENT_TOGGLE"

    const/16 v15, 0x26

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_SPENT_TOGGLE:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 43
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_START_EARNING"

    const/16 v15, 0x27

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_START_EARNING:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 44
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_SUBMIT_ORDER"

    const/16 v15, 0x28

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_SUBMIT_ORDER:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 45
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "PWI_TERMS_AND_CONDITIONS"

    const/16 v15, 0x29

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_TERMS_AND_CONDITIONS:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 46
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "RECEIPT_OFFER_DIFF"

    const/16 v15, 0x2a

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->RECEIPT_OFFER_DIFF:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 47
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "REDEEM_PATH_HEADER"

    const/16 v15, 0x2b

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->REDEEM_PATH_HEADER:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 48
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "REDEEM_PATH_MCOMM_SHOP"

    const/16 v15, 0x2c

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->REDEEM_PATH_MCOMM_SHOP:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 49
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "RETAILER_BOTTOM_NAV"

    const/16 v15, 0x2d

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->RETAILER_BOTTOM_NAV:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 50
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "SCANNED_BARCODE"

    const/16 v15, 0x2e

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->SCANNED_BARCODE:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 51
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "SPOTLIGHT_VIEW"

    const/16 v15, 0x2f

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->SPOTLIGHT_VIEW:Lcom/ibotta/android/aop/tracking/TrackingType;

    .line 52
    new-instance v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    const-string v1, "UNLOCK_OFFER"

    const/16 v15, 0x30

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/aop/tracking/TrackingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->UNLOCK_OFFER:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v0, 0x31

    .line 3
    new-array v0, v0, [Lcom/ibotta/android/aop/tracking/TrackingType;

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->AVAILABLE_AT_RETAILER_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->BGC_PAY_AT_RETAILER:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->BOTTOM_NAV:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->CHANGED_PREFERENCE:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->CONNECTION_LOST:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->DEAD_END_BONUS:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->DEAD_END_SEARCH:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->ENGAGEMENT_COMPLETE:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->ENGAGEMENT_START:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->GENERIC:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_ACCOUNT_LOGIN_VIEWED:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_ACCOUNT_LOGIN_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v13

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_ACCOUNT_CREATE_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;

    aput-object v1, v0, v14

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_TERMS_CANCEL:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_TERMS_AGREE:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_CONNECTION_ISSUE:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_CHECK_FOR_REWARDS:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->IM_SHARE_HISTORY:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->LAUNCH_PARTNER_APP:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->LOAD_TIME:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->NO_OP:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->OFFER_SHARE:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->OFFER_DEAD_END:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->OFFER_RETAILER_CLICKED:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PAGE_VIEW:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ADD_PAYMENT_METHOD:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_CONFIRM_PAYMENT_CANCELLED:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_COPY_BARCODE_NUMBER:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ERRORS:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_HELP:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_MANAGE_TRANSACTION_ACTION:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_MANAGE_TRANSACTIONS:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ONBOARDING_NEXT:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ONBOARDING_CLOSE:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x21

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_ORDER_SUCCESSFULLY_COMPLETE:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x22

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_PAY_AT_RETAILER:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x23

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_RETAILER_TRANSACTIONS:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x24

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_REVEAL_CARD_NUMBER:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x25

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_SPENT_TOGGLE:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x26

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_START_EARNING:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x27

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_SUBMIT_ORDER:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x28

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->PWI_TERMS_AND_CONDITIONS:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x29

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->RECEIPT_OFFER_DIFF:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->REDEEM_PATH_HEADER:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->REDEEM_PATH_MCOMM_SHOP:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->RETAILER_BOTTOM_NAV:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->SCANNED_BARCODE:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->SPOTLIGHT_VIEW:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/aop/tracking/TrackingType;->UNLOCK_OFFER:Lcom/ibotta/android/aop/tracking/TrackingType;

    const/16 v2, 0x30

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->$VALUES:[Lcom/ibotta/android/aop/tracking/TrackingType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/aop/tracking/TrackingType;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/android/aop/tracking/TrackingType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/aop/tracking/TrackingType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/aop/tracking/TrackingType;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/android/aop/tracking/TrackingType;->$VALUES:[Lcom/ibotta/android/aop/tracking/TrackingType;

    invoke-virtual {v0}, [Lcom/ibotta/android/aop/tracking/TrackingType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/aop/tracking/TrackingType;

    return-object v0
.end method
