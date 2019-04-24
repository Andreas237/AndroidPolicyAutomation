.class public Lcom/huawei/ui/openservice/db/model/ServiceTable;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COLUMN_END_DATE:Ljava/lang/String; = "end_date"

.field public static final COLUMN_HOME_PAGE_ICON:Ljava/lang/String; = "home_page_icon"

.field public static final COLUMN_ID:Ljava/lang/String; = "id"

.field public static final COLUMN_IS_PLUGIN:Ljava/lang/String; = "is_plugin"

.field public static final COLUMN_IS_SERVICE_CARD:Ljava/lang/String; = "is_service_card"

.field public static final COLUMN_MODIFY_TIME:Ljava/lang/String; = "modify_time"

.field public static final COLUMN_NEED_RECOMMEND:Ljava/lang/String; = "need_recommend"

.field public static final COLUMN_PLUGIN_URL:Ljava/lang/String; = "plugin_url"

.field public static final COLUMN_SERVICE_APP_ID:Ljava/lang/String; = "service_app_id"

.field public static final COLUMN_SERVICE_AUTH_TYPE:Ljava/lang/String; = "service_auth_type"

.field public static final COLUMN_SERVICE_DESCRIPTION:Ljava/lang/String; = "service_description"

.field public static final COLUMN_SERVICE_DETAIL:Ljava/lang/String; = "service_detail"

.field public static final COLUMN_SERVICE_HMS_AUTH:Ljava/lang/String; = "service_hms_auth"

.field public static final COLUMN_SERVICE_ICON:Ljava/lang/String; = "service_icon"

.field public static final COLUMN_SERVICE_ID:Ljava/lang/String; = "service_id"

.field public static final COLUMN_SERVICE_KEEP_1:Ljava/lang/String; = "service_keep_1"

.field public static final COLUMN_SERVICE_KEEP_2:Ljava/lang/String; = "service_keep_2"

.field public static final COLUMN_SERVICE_KEEP_3:Ljava/lang/String; = "service_keep_3"

.field public static final COLUMN_SERVICE_KEEP_4:Ljava/lang/String; = "service_keep_4"

.field public static final COLUMN_SERVICE_KEEP_5:Ljava/lang/String; = "service_keep_5"

.field public static final COLUMN_SERVICE_LABEL:Ljava/lang/String; = "label"

.field public static final COLUMN_SERVICE_MID_ICON:Ljava/lang/String; = "service_mid_icon"

.field public static final COLUMN_SERVICE_PRODUCT_NAME:Ljava/lang/String; = "service_product_name"

.field public static final COLUMN_SERVICE_PROVIDER:Ljava/lang/String; = "service_provider"

.field public static final COLUMN_SERVICE_REQUIRED_VERSION:Ljava/lang/String; = "service_required_version"

.field public static final COLUMN_SERVICE_SOURCE:Ljava/lang/String; = "service_source"

.field public static final COLUMN_SERVICE_TYPE_ID:Ljava/lang/String; = "service_type"

.field public static final COLUMN_SERVICE_URL:Ljava/lang/String; = "service_url"

.field public static final COLUMN_START_DATE:Ljava/lang/String; = "start_date"

.field public static final COLUMN_SUB_POSITION:Ljava/lang/String; = "sub_position"

.field public static final TABLE_NAME:Ljava/lang/String; = "service"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getColumns()[Ljava/lang/String;
    .locals 3

    .line 80
    const/16 v0, 0x1e

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "service_id"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "service_type"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "service_product_name"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "service_description"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "service_icon"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "home_page_icon"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "service_provider"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "service_url"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "service_required_version"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "service_hms_auth"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "service_auth_type"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "start_date"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "end_date"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "sub_position"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "service_app_id"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "modify_time"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "label"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "is_service_card"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "need_recommend"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "is_plugin"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "plugin_url"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "service_source"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "service_detail"

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "service_mid_icon"

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const-string v1, "service_keep_1"

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const-string v1, "service_keep_2"

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    const-string v1, "service_keep_3"

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    const-string v1, "service_keep_4"

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    const-string v1, "service_keep_5"

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static getCreateTableSQL()Ljava/lang/String;
    .locals 2

    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    const-string v0, "create table  IF NOT EXISTS service("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    const-string v0, "id integer primary key not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    const-string v0, "service_id text not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    const-string v0, "service_type text not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    const-string v0, "service_product_name text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    const-string v0, "service_description text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    const-string v0, "service_icon text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    const-string v0, "home_page_icon text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    const-string v0, "service_provider text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    const-string v0, "service_url text not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    const-string v0, "service_required_version text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    const-string v0, "service_hms_auth integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    const-string v0, "service_auth_type text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    const-string v0, "start_date integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    const-string v0, "end_date integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    const-string v0, "sub_position integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    const-string v0, "service_app_id text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    const-string v0, "modify_time integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    const-string v0, "label text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    const-string v0, "is_service_card integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    const-string v0, "need_recommend integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    const-string v0, "is_plugin integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    const-string v0, "plugin_url text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    const-string v0, "service_source text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    const-string v0, "service_detail text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    const-string v0, "service_mid_icon text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    const-string v0, "service_keep_1 text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    const-string v0, "service_keep_2 text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    const-string v0, "service_keep_3 text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    const-string v0, "service_keep_4 text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    const-string v0, "service_keep_5 text"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
