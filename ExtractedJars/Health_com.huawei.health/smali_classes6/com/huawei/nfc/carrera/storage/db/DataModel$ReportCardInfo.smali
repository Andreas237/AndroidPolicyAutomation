.class public final Lcom/huawei/nfc/carrera/storage/db/DataModel$ReportCardInfo;
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
    name = "ReportCardInfo"
.end annotation


# static fields
.field public static final COLUMN_NAME_AID:Ljava/lang/String; = "aid"

.field public static final COLUMN_NAME_CARD_NAME:Ljava/lang/String; = "card_name"

.field public static final COLUMN_NAME_CARD_NUMBER:Ljava/lang/String; = "card_number"

.field public static final COLUMN_NAME_CARD_STATUS:Ljava/lang/String; = "status"

.field public static final COLUMN_NAME_CARD_TYPE:Ljava/lang/String; = "card_type"

.field public static final COLUMN_NAME_CARD_USERID:Ljava/lang/String; = "user_id"

.field public static final COLUMN_NAME_DPANID:Ljava/lang/String; = "dpanid"

.field public static final COLUMN_NAME_EXTRA:Ljava/lang/String; = "extra"

.field public static final COLUMN_NAME_ISSUSERID:Ljava/lang/String; = "issuserid"

.field public static final CONTENT_URI:Landroid/net/Uri;

.field public static final TABLE_NAME:Ljava/lang/String; = "report_status_info"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    const-string v0, "content://com.huawei.health/report_status_info"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$ReportCardInfo;->CONTENT_URI:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
