.class public final Lcom/huawei/nfc/carrera/storage/db/DataModel$CardProductInfoColumns;
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
    name = "CardProductInfoColumns"
.end annotation


# static fields
.field public static final COLUMN_NAME_CARD_TYPE:Ljava/lang/String; = "card_type"

.field public static final COLUMN_NAME_DESCRIPTION:Ljava/lang/String; = "description"

.field public static final COLUMN_NAME_FONT_COLOR:Ljava/lang/String; = "font_color"

.field public static final COLUMN_NAME_ISSUER_ID:Ljava/lang/String; = "issuer_id"

.field public static final COLUMN_NAME_MKT_INFO:Ljava/lang/String; = "mkt_info"

.field public static final COLUMN_NAME_PIC_URL:Ljava/lang/String; = "pic_url"

.field public static final COLUMN_NAME_PRODUCT_ID:Ljava/lang/String; = "product_id"

.field public static final COLUMN_NAME_PRODUCT_NAME:Ljava/lang/String; = "name"

.field public static final COLUMN_NAME_RESERVDINFO:Ljava/lang/String; = "reserved_info"

.field public static final COLUMN_NAME_RESERVD_1:Ljava/lang/String; = "reserved_1"

.field public static final COLUMN_NAME_RESERVD_2:Ljava/lang/String; = "reserved_2"

.field public static final COLUMN_NAME_RESERVD_3:Ljava/lang/String; = "reserved_3"

.field public static final COLUMN_NAME_RESERVD_4:Ljava/lang/String; = "reserved_4"

.field public static final COLUMN_NAME_RESERVD_5:Ljava/lang/String; = "reserved_5"

.field public static final COLUMN_NAME_RESERVD_6:Ljava/lang/String; = "reserved_6"

.field public static final COLUMN_NAME_TIMESTAMP:Ljava/lang/String; = "timestamp"

.field public static final COLUMN_NAME_VERSION:Ljava/lang/String; = "version"

.field public static final CONTENT_URI:Landroid/net/Uri;

.field public static final TABLE_NAME:Ljava/lang/String; = "card_product_info"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 221
    const-string v0, "content://com.huawei.health/card_product_info"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardProductInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
