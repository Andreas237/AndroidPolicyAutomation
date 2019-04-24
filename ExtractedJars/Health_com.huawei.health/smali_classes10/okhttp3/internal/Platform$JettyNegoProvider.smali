.class Lokhttp3/internal/Platform$JettyNegoProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/Platform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "JettyNegoProvider"
.end annotation


# instance fields
.field private final protocols:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private selected:Ljava/lang/String;

.field private unsupported:Z


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 361
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 362
    iput-object p1, p0, Lokhttp3/internal/Platform$JettyNegoProvider;->protocols:Ljava/util/List;

    .line 363
    return-void
.end method

.method static synthetic access$000(Lokhttp3/internal/Platform$JettyNegoProvider;)Z
    .locals 1

    .line 353
    iget-boolean v0, p0, Lokhttp3/internal/Platform$JettyNegoProvider;->unsupported:Z

    return v0
.end method

.method static synthetic access$100(Lokhttp3/internal/Platform$JettyNegoProvider;)Ljava/lang/String;
    .locals 1

    .line 353
    iget-object v0, p0, Lokhttp3/internal/Platform$JettyNegoProvider;->selected:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 366
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    .line 367
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v3

    .line 368
    if-nez p3, :cond_0

    .line 369
    sget-object p3, Lokhttp3/internal/Util;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    .line 371
    :cond_0
    const-string v0, "supports"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v0, v3, :cond_1

    .line 372
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 373
    :cond_1
    const-string v0, "unsupported"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne v0, v3, :cond_2

    .line 374
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/Platform$JettyNegoProvider;->unsupported:Z

    .line 375
    const/4 v0, 0x0

    return-object v0

    .line 376
    :cond_2
    const-string v0, "protocols"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    array-length v0, p3

    if-nez v0, :cond_3

    .line 377
    iget-object v0, p0, Lokhttp3/internal/Platform$JettyNegoProvider;->protocols:Ljava/util/List;

    return-object v0

    .line 378
    :cond_3
    const-string v0, "selectProtocol"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "select"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_4
    const-class v0, Ljava/lang/String;

    if-ne v0, v3, :cond_7

    array-length v0, p3

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    const/4 v0, 0x0

    aget-object v0, p3, v0

    instance-of v0, v0, Ljava/util/List;

    if-eqz v0, :cond_7

    .line 380
    const/4 v0, 0x0

    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 382
    const/4 v5, 0x0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_6

    .line 383
    iget-object v0, p0, Lokhttp3/internal/Platform$JettyNegoProvider;->protocols:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 384
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/internal/Platform$JettyNegoProvider;->selected:Ljava/lang/String;

    return-object v0

    .line 382
    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 387
    :cond_6
    iget-object v0, p0, Lokhttp3/internal/Platform$JettyNegoProvider;->protocols:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/internal/Platform$JettyNegoProvider;->selected:Ljava/lang/String;

    return-object v0

    .line 388
    :cond_7
    const-string v0, "protocolSelected"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "selected"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_8
    array-length v0, p3

    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    .line 390
    const/4 v0, 0x0

    aget-object v0, p3, v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/internal/Platform$JettyNegoProvider;->selected:Ljava/lang/String;

    .line 391
    const/4 v0, 0x0

    return-object v0

    .line 393
    :cond_9
    invoke-virtual {p2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
