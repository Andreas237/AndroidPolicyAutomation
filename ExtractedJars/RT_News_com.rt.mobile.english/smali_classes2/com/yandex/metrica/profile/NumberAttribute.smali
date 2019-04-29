.class public final Lcom/yandex/metrica/profile/NumberAttribute;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ip;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/nk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ij;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/ij;",
            ")V"
        }
    .end annotation

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Lcom/yandex/metrica/impl/ob/ip;

    invoke-direct {v0, p1, p2, p3}, Lcom/yandex/metrica/impl/ob/ip;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V

    iput-object v0, p0, Lcom/yandex/metrica/profile/NumberAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    return-void
.end method


# virtual methods
.method public withValue(D)Lcom/yandex/metrica/profile/UserProfileUpdate;
    .locals 8
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Lcom/yandex/metrica/profile/UserProfileUpdate<",
            "+",
            "Lcom/yandex/metrica/impl/ob/jb;",
            ">;"
        }
    .end annotation

    .line 57
    new-instance v0, Lcom/yandex/metrica/profile/UserProfileUpdate;

    new-instance v7, Lcom/yandex/metrica/impl/ob/it;

    iget-object v1, p0, Lcom/yandex/metrica/profile/NumberAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 59
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ip;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lcom/yandex/metrica/impl/ob/iq;

    invoke-direct {v5}, Lcom/yandex/metrica/impl/ob/iq;-><init>()V

    new-instance v6, Lcom/yandex/metrica/impl/ob/im;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ir;

    new-instance v3, Lcom/yandex/metrica/impl/ob/mu;

    const/16 v4, 0x64

    invoke-direct {v3, v4}, Lcom/yandex/metrica/impl/ob/mu;-><init>(I)V

    invoke-direct {v1, v3}, Lcom/yandex/metrica/impl/ob/ir;-><init>(Lcom/yandex/metrica/impl/ob/mu;)V

    invoke-direct {v6, v1}, Lcom/yandex/metrica/impl/ob/im;-><init>(Lcom/yandex/metrica/impl/ob/ij;)V

    move-object v1, v7

    move-wide v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/yandex/metrica/impl/ob/it;-><init>(Ljava/lang/String;DLcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V

    invoke-direct {v0, v7}, Lcom/yandex/metrica/profile/UserProfileUpdate;-><init>(Lcom/yandex/metrica/impl/ob/jb;)V

    return-object v0
.end method

.method public withValueIfUndefined(D)Lcom/yandex/metrica/profile/UserProfileUpdate;
    .locals 8
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Lcom/yandex/metrica/profile/UserProfileUpdate<",
            "+",
            "Lcom/yandex/metrica/impl/ob/jb;",
            ">;"
        }
    .end annotation

    .line 81
    new-instance v0, Lcom/yandex/metrica/profile/UserProfileUpdate;

    new-instance v7, Lcom/yandex/metrica/impl/ob/it;

    iget-object v1, p0, Lcom/yandex/metrica/profile/NumberAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 83
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ip;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lcom/yandex/metrica/impl/ob/iq;

    invoke-direct {v5}, Lcom/yandex/metrica/impl/ob/iq;-><init>()V

    new-instance v6, Lcom/yandex/metrica/impl/ob/iw;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ir;

    new-instance v3, Lcom/yandex/metrica/impl/ob/mu;

    const/16 v4, 0x64

    invoke-direct {v3, v4}, Lcom/yandex/metrica/impl/ob/mu;-><init>(I)V

    invoke-direct {v1, v3}, Lcom/yandex/metrica/impl/ob/ir;-><init>(Lcom/yandex/metrica/impl/ob/mu;)V

    invoke-direct {v6, v1}, Lcom/yandex/metrica/impl/ob/iw;-><init>(Lcom/yandex/metrica/impl/ob/ij;)V

    move-object v1, v7

    move-wide v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/yandex/metrica/impl/ob/it;-><init>(Ljava/lang/String;DLcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V

    invoke-direct {v0, v7}, Lcom/yandex/metrica/profile/UserProfileUpdate;-><init>(Lcom/yandex/metrica/impl/ob/jb;)V

    return-object v0
.end method

.method public withValueReset()Lcom/yandex/metrica/profile/UserProfileUpdate;
    .locals 7
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/yandex/metrica/profile/UserProfileUpdate<",
            "+",
            "Lcom/yandex/metrica/impl/ob/jb;",
            ">;"
        }
    .end annotation

    .line 102
    new-instance v0, Lcom/yandex/metrica/profile/UserProfileUpdate;

    new-instance v1, Lcom/yandex/metrica/impl/ob/iv;

    iget-object v2, p0, Lcom/yandex/metrica/profile/NumberAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 105
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ip;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/yandex/metrica/impl/ob/iq;

    invoke-direct {v3}, Lcom/yandex/metrica/impl/ob/iq;-><init>()V

    new-instance v4, Lcom/yandex/metrica/impl/ob/ir;

    new-instance v5, Lcom/yandex/metrica/impl/ob/mu;

    const/16 v6, 0x64

    invoke-direct {v5, v6}, Lcom/yandex/metrica/impl/ob/mu;-><init>(I)V

    invoke-direct {v4, v5}, Lcom/yandex/metrica/impl/ob/ir;-><init>(Lcom/yandex/metrica/impl/ob/mu;)V

    const/4 v5, 0x1

    invoke-direct {v1, v5, v2, v3, v4}, Lcom/yandex/metrica/impl/ob/iv;-><init>(ILjava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/profile/UserProfileUpdate;-><init>(Lcom/yandex/metrica/impl/ob/jb;)V

    return-object v0
.end method
