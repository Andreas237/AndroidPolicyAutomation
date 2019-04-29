.class public final Lcom/yandex/metrica/impl/ob/eq$ah;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/eq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ah"
.end annotation


# static fields
.field public static final a:[Ljava/lang/String;

.field static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/4 v0, 0x7

    .line 256
    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "id"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "start_time"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "network_info"

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const-string v2, "report_request_parameters"

    const/4 v6, 0x3

    aput-object v2, v1, v6

    const-string v2, "server_time_offset"

    const/4 v7, 0x4

    aput-object v2, v1, v7

    const-string v2, "type"

    const/4 v8, 0x5

    aput-object v2, v1, v8

    const-string v2, "obtained_before_first_sync"

    const/4 v9, 0x6

    aput-object v2, v1, v9

    sput-object v1, Lcom/yandex/metrica/impl/ob/eq$ah;->a:[Ljava/lang/String;

    .line 287
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CREATE TABLE IF NOT EXISTS sessions (id INTEGER,start_time INTEGER,network_info TEXT,report_request_parameters TEXT,server_time_offset INTEGER,type INTEGER DEFAULT "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/yandex/metrica/impl/ob/dr;->a:Lcom/yandex/metrica/impl/ob/dr;

    .line 294
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/dr;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",obtained_before_first_sync INTEGER DEFAULT 0 )"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/yandex/metrica/impl/ob/eq$ah;->b:Ljava/lang/String;

    .line 332
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "(select count(%s.%s) from %s where %s.%s = %s.%s) = 0 and %s NOT IN (%s)"

    const/16 v10, 0x9

    new-array v10, v10, [Ljava/lang/Object;

    const-string v11, "reports"

    aput-object v11, v10, v3

    const-string v3, "id"

    aput-object v3, v10, v4

    const-string v3, "reports"

    aput-object v3, v10, v5

    const-string v3, "reports"

    aput-object v3, v10, v6

    const-string v3, "session_id"

    aput-object v3, v10, v7

    const-string v3, "sessions"

    aput-object v3, v10, v8

    const-string v3, "id"

    aput-object v3, v10, v9

    const-string v3, "id"

    aput-object v3, v10, v0

    .line 346
    invoke-static {v5}, Lcom/yandex/metrica/impl/ob/ln;->a(I)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x8

    aput-object v0, v10, v3

    .line 333
    invoke-static {v1, v2, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/eq$ah;->c:Ljava/lang/String;

    return-void
.end method
