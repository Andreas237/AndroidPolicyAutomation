.class public final Lcom/huawei/nfc/carrera/storage/db/DataModel$RFConfInfoColumns;
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
    name = "RFConfInfoColumns"
.end annotation


# static fields
.field public static final COLUMN_NAME_ISSUER_ID:Ljava/lang/String; = "issuer_id"

.field public static final COLUMN_NAME_MODEL:Ljava/lang/String; = "model"

.field public static final COLUMN_NAME_RFCONF_URL:Ljava/lang/String; = "rf_conf_url"

.field public static final COLUMN_NAME_ROM_VERSION:Ljava/lang/String; = "rom_version"

.field public static final COLUMN_NAME_TIMESTAMP:Ljava/lang/String; = "timestamp"

.field public static final CONTENT_URI:Landroid/net/Uri;

.field public static final TABLE_NAME:Ljava/lang/String; = "rf_conf_info"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 319
    const-string v0, "content://com.huawei.health/rf_conf_info"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$RFConfInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 309
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
