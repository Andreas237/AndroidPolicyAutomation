.class public Lcom/huawei/ui/openservice/db/model/ServiceVersionTable;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COLUMN_DATE:Ljava/lang/String; = "date"

.field public static final COLUMN_ID:Ljava/lang/String; = "id"

.field public static final COLUMN_MODIFY_TIME:Ljava/lang/String; = "modify_time"

.field public static final COLUMN_VERSION:Ljava/lang/String; = "version"

.field public static final TABLE_NAME:Ljava/lang/String; = "service_version"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getColumns()[Ljava/lang/String;
    .locals 3

    .line 32
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "version"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "date"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "modify_time"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static getCreateTableSQL()Ljava/lang/String;
    .locals 2

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    const-string v0, "create table  IF NOT EXISTS service_version("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    const-string v0, "id integer primary key not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    const-string v0, "version text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    const-string v0, "date text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    const-string v0, "modify_time integer"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
