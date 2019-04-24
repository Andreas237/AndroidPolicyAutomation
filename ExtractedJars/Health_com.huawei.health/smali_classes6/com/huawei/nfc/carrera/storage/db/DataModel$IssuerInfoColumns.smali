.class public final Lcom/huawei/nfc/carrera/storage/db/DataModel$IssuerInfoColumns;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/provider/BaseColumns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/storage/db/DataModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IssuerInfoColumns"
.end annotation


# static fields
.field public static final COLUMN_NAME_APK_VERSION:Ljava/lang/String; = "wallet_version"

.field public static final COLUMN_NAME_APPINFO:Ljava/lang/String; = "app_info"

.field public static final COLUMN_NAME_CITYCODE:Ljava/lang/String; = "city_code"

.field public static final COLUMN_NAME_CONTACT_NUM:Ljava/lang/String; = "contact_num"

.field public static final COLUMN_NAME_CREDITTC_URL:Ljava/lang/String; = "credit_tcurl"

.field public static final COLUMN_NAME_CREDIT_CALL_NUM:Ljava/lang/String; = "credit_call_center_num"

.field public static final COLUMN_NAME_CREDIT_WEBSITE_URL:Ljava/lang/String; = "credit_website_url"

.field public static final COLUMN_NAME_DEBITTC_URL:Ljava/lang/String; = "debit_tcurl"

.field public static final COLUMN_NAME_DEBIT_CALL_NUM:Ljava/lang/String; = "debit_callcenter_num"

.field public static final COLUMN_NAME_DEBIT_WEBSITE_URL:Ljava/lang/String; = "debit_website_url"

.field public static final COLUMN_NAME_DESCRIPTION:Ljava/lang/String; = "description"

.field public static final COLUMN_NAME_ISSUERID:Ljava/lang/String; = "issuer_id"

.field public static final COLUMN_NAME_ISSUER_NAME:Ljava/lang/String; = "name"

.field public static final COLUMN_NAME_ISSUER_TYPE:Ljava/lang/String; = "issuer_type"

.field public static final COLUMN_NAME_LOGO_URL:Ljava/lang/String; = "logo_url"

.field public static final COLUMN_NAME_MODE:Ljava/lang/String; = "mode"

.field public static final COLUMN_NAME_PAYTYPE:Ljava/lang/String; = "pay_type"

.field public static final COLUMN_NAME_RESERVDINFO:Ljava/lang/String; = "reserved_info"

.field public static final COLUMN_NAME_SN:Ljava/lang/String; = "sn"

.field public static final COLUMN_NAME_SUPPORT_CARD_TYPE:Ljava/lang/String; = "support_card_type"

.field public static final COLUMN_NAME_TIMESTAMP:Ljava/lang/String; = "timestamp"

.field public static final CONTENT_URI:Landroid/net/Uri;

.field public static final TABLE_NAME:Ljava/lang/String; = "issuer_info"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 103
    const-string v0, "content://com.huawei.health/issuer_info"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$IssuerInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
