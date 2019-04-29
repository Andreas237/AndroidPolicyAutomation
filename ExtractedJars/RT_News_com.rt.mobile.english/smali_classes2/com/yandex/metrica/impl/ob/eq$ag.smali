.class public final Lcom/yandex/metrica/impl/ob/eq$ag;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/eq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ag"
.end annotation


# static fields
.field public static final a:[Ljava/lang/String;

.field static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x17

    .line 138
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "number"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "name"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "value"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "type"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "time"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "session_id"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "wifi_network_info"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "cell_info"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "location_info"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "error_environment"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "user_info"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "session_type"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "app_environment"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "app_environment_revision"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "truncated"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "connection_type"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "cellular_connection_type"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "custom_type"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "wifi_access_point"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "encrypting_mode"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "profile_id"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "first_occurrence_status"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sput-object v0, Lcom/yandex/metrica/impl/ob/eq$ag;->a:[Ljava/lang/String;

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT \'\',cell_info TEXT DEFAULT \'\',location_info TEXT DEFAULT \'\',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/yandex/metrica/impl/ob/dr;->a:Lcom/yandex/metrica/impl/ob/dr;

    .line 208
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/dr;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",app_environment TEXT DEFAULT \'{}\',app_environment_revision INTEGER DEFAULT 0,truncated INTEGER DEFAULT 0,connection_type INTEGER DEFAULT 2,cellular_connection_type TEXT,custom_type INTEGER DEFAULT 0, wifi_access_point TEXT, encrypting_mode INTEGER DEFAULT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/yandex/metrica/impl/ob/mo;->a:Lcom/yandex/metrica/impl/ob/mo;

    .line 220
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/mo;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", profile_id TEXT, first_occurrence_status INTEGER DEFAULT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/yandex/metrica/impl/r;->a:Lcom/yandex/metrica/impl/r;

    iget v1, v1, Lcom/yandex/metrica/impl/r;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " )"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/eq$ag;->b:Ljava/lang/String;

    return-void
.end method
