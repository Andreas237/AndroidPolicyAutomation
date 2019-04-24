.class public final Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;
.super Ljava/lang/Object;
.source "MoreObjects.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/MoreObjects;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ToStringHelper"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;
    }
.end annotation


# instance fields
.field private final className:Ljava/lang/String;

.field private holderHead:Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private holderTail:Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation
.end field

.field private omitNullValues:Z


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    new-instance v0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;-><init>(Lcom/nytimes/android/external/cache/MoreObjects$1;)V

    iput-object v0, p0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->holderHead:Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    .line 114
    iget-object v0, p0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->holderHead:Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    iput-object v0, p0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->holderTail:Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    const/4 v0, 0x0

    .line 116
    iput-boolean v0, p0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->omitNullValues:Z

    .line 122
    invoke-static {p1}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->className:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/nytimes/android/external/cache/MoreObjects$1;)V
    .locals 0

    .line 110
    invoke-direct {p0, p1}, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private addHolder()Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;
    .locals 2
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 356
    new-instance v0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;-><init>(Lcom/nytimes/android/external/cache/MoreObjects$1;)V

    .line 357
    iget-object v1, p0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->holderTail:Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    iput-object v0, v1, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;->next:Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    iput-object v0, p0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->holderTail:Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    return-object v0
.end method

.method private addHolder(Ljava/lang/Object;)Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 363
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->addHolder()Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    move-result-object v0

    .line 364
    iput-object p1, v0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;->value:Ljava/lang/Object;

    return-object p0
.end method

.method private addHolder(Ljava/lang/String;Ljava/lang/Object;)Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 370
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->addHolder()Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    move-result-object v0

    .line 371
    iput-object p2, v0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;->value:Ljava/lang/Object;

    .line 372
    invoke-static {p1}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, v0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;->name:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public add(Ljava/lang/String;I)Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 206
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->addHolder(Ljava/lang/String;Ljava/lang/Object;)Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;

    move-result-object p1

    return-object p1
.end method

.method public add(Ljava/lang/String;J)Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 217
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->addHolder(Ljava/lang/String;Ljava/lang/Object;)Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;

    move-result-object p1

    return-object p1
.end method

.method public add(Ljava/lang/String;Ljava/lang/Object;)Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 147
    invoke-direct {p0, p1, p2}, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->addHolder(Ljava/lang/String;Ljava/lang/Object;)Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;

    move-result-object p1

    return-object p1
.end method

.method public addValue(Ljava/lang/Object;)Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;
    .locals 0
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 228
    invoke-direct {p0, p1}, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->addHolder(Ljava/lang/Object;)Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 328
    iget-boolean v0, p0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->omitNullValues:Z

    const-string v1, ""

    .line 330
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v3, p0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->className:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x7b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 331
    iget-object v3, p0, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper;->holderHead:Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    iget-object v3, v3, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;->next:Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    :goto_0
    if-eqz v3, :cond_4

    .line 334
    iget-object v4, v3, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;->value:Ljava/lang/Object;

    if-eqz v0, :cond_0

    if-eqz v4, :cond_3

    .line 336
    :cond_0
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 339
    iget-object v5, v3, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;->name:Ljava/lang/String;

    if-eqz v5, :cond_1

    .line 340
    iget-object v5, v3, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;->name:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x3d

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    if-eqz v4, :cond_2

    .line 342
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    .line 343
    new-array v6, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v4, v6, v7

    .line 344
    invoke-static {v6}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 345
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v5

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 347
    :cond_2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 333
    :cond_3
    :goto_1
    iget-object v3, v3, Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;->next:Lcom/nytimes/android/external/cache/MoreObjects$ToStringHelper$ValueHolder;

    goto :goto_0

    :cond_4
    const/16 v0, 0x7d

    .line 351
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
