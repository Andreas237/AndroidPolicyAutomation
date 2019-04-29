.class public Lcom/yandex/metrica/impl/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final a:J


# instance fields
.field private b:J

.field private c:J

.field private d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 17
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/yandex/metrica/impl/c$a;->a:J

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 25
    sget-wide v0, Lcom/yandex/metrica/impl/c$a;->a:J

    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/impl/c$a;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 20
    iput-wide v0, p0, Lcom/yandex/metrica/impl/c$a;->c:J

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/yandex/metrica/impl/c$a;->d:Ljava/lang/Object;

    .line 29
    iput-wide p1, p0, Lcom/yandex/metrica/impl/c$a;->b:J

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/yandex/metrica/impl/c$a;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 41
    iput-object p1, p0, Lcom/yandex/metrica/impl/c$a;->d:Ljava/lang/Object;

    .line 1051
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/c$a;->c:J

    return-void
.end method

.method public final a(J)Z
    .locals 6

    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/yandex/metrica/impl/c$a;->c:J

    sub-long v4, v0, v2

    cmp-long v0, v4, p1

    if-gtz v0, :cond_1

    const-wide/16 p1, 0x0

    cmp-long v0, v4, p1

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final b()Z
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/yandex/metrica/impl/c$a;->d:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Z
    .locals 2

    .line 60
    iget-wide v0, p0, Lcom/yandex/metrica/impl/c$a;->b:J

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/c$a;->a(J)Z

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 64
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/c$a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/c$a;->d:Ljava/lang/Object;

    return-object v0
.end method
