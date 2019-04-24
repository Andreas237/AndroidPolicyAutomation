.class public Lcom/huawei/ui/openservice/db/model/UserServiceAuthTable;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COLUMN_HUID:Ljava/lang/String; = "huid"

.field public static final COLUMN_ID:Ljava/lang/String; = "id"

.field public static final COLUMN_MODIFY_TIME:Ljava/lang/String; = "modify_time"

.field public static final COLUMN_SERVICE_AUTH:Ljava/lang/String; = "service_auth"

.field public static final COLUMN_SERVICE_ID:Ljava/lang/String; = "service_id"

.field public static final TABLE_NAME:Ljava/lang/String; = "user_service_auth"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getColumns()[Ljava/lang/String;
    .locals 3

    .line 35
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "huid"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "service_id"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "service_auth"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "modify_time"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static getCreateTableSQL()Ljava/lang/String;
    .locals 2

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    const-string v0, "create table  IF NOT EXISTS user_service_auth("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    const-string v0, "id integer primary key not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    const-string v0, "huid text not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    const-string v0, "service_id text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    const-string v0, "service_auth integer,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    const-string v0, "modify_time integer "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
