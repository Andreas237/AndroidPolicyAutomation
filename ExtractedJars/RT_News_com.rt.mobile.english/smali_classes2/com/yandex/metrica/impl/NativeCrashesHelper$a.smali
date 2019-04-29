.class Lcom/yandex/metrica/impl/NativeCrashesHelper$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/NativeCrashesHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/bf;

.field private final b:Lcom/yandex/metrica/impl/NativeCrashesHelper;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/NativeCrashesHelper;)V
    .locals 0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    iput-object p2, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper$a;->b:Lcom/yandex/metrica/impl/NativeCrashesHelper;

    .line 122
    iput-object p1, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper$a;->a:Lcom/yandex/metrica/impl/bf;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 127
    iget-object v0, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper$a;->b:Lcom/yandex/metrica/impl/NativeCrashesHelper;

    invoke-static {v0}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->a(Lcom/yandex/metrica/impl/NativeCrashesHelper;)Ljava/lang/String;

    move-result-object v0

    .line 128
    invoke-static {v0}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->a(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v4, v1, v2

    .line 129
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 133
    :try_start_0
    invoke-static {v4}, Lcom/yandex/metrica/impl/u;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 134
    invoke-static {v5}, Lcom/yandex/metrica/impl/u;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 137
    iget-object v6, p0, Lcom/yandex/metrica/impl/NativeCrashesHelper$a;->a:Lcom/yandex/metrica/impl/bf;

    invoke-virtual {v6, v5}, Lcom/yandex/metrica/impl/bf;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    :cond_0
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 144
    throw v0

    .line 142
    :catch_0
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
