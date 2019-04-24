.class public Lcom/huawei/ui/openservice/db/model/ChildServiceTable;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COLUMN_AUTH_TYPE:Ljava/lang/String; = "auth_type"

.field public static final COLUMN_DESCRIPTION:Ljava/lang/String; = "description"

.field public static final COLUMN_END_DATE:Ljava/lang/String; = "end_date"

.field public static final COLUMN_HMS_AUTH:Ljava/lang/String; = "hms_auth"

.field public static final COLUMN_ID:Ljava/lang/String; = "id"

.field public static final COLUMN_IMAGE_URL:Ljava/lang/String; = "image_Url"

.field public static final COLUMN_KEEP_1:Ljava/lang/String; = "keep_1"

.field public static final COLUMN_KEEP_2:Ljava/lang/String; = "keep_2"

.field public static final COLUMN_KEEP_3:Ljava/lang/String; = "keep_3"

.field public static final COLUMN_LOCATION:Ljava/lang/String; = "location"

.field public static final COLUMN_MODIFY_TIME:Ljava/lang/String; = "modify_time"

.field public static final COLUMN_POSITION:Ljava/lang/String; = "position"

.field public static final COLUMN_SERVICE_ID:Ljava/lang/String; = "service_id"

.field public static final COLUMN_SERVICE_NAME:Ljava/lang/String; = "service_name"

.field public static final COLUMN_START_DATE:Ljava/lang/String; = "start_date"

.field public static final COLUMN_SUB_TYPE:Ljava/lang/String; = "sub_type"

.field public static final COLUMN_URL:Ljava/lang/String; = "url"

.field public static final TABLE_NAME:Ljava/lang/String; = "child_service"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getColumns()[Ljava/lang/String;
    .locals 3

    .line 54
    const/16 v0, 0x11

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "service_id"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "position"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "location"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "description"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "image_Url"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "url"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "start_date"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "end_date"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "hms_auth"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "auth_type"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "modify_time"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "service_name"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "sub_type"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "keep_1"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "keep_2"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "keep_3"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static getCreateTableSQL()Ljava/lang/String;
    .locals 2

    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    const-string v0, "create table  IF NOT EXISTS child_service("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    const-string v0, "id integer primary key not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    const-string v0, "service_id text not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    const-string v0, "position integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    const-string v0, "location text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    const-string v0, "description text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    const-string v0, "image_Url text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    const-string v0, "url text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    const-string v0, "start_date integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    const-string v0, "end_date integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    const-string v0, "hms_auth integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    const-string v0, "auth_type text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    const-string v0, "modify_time integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    const-string v0, "service_name text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    const-string v0, "sub_type text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    const-string v0, "keep_1 text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    const-string v0, "keep_2 text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    const-string v0, "keep_3 text"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
