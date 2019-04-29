.class public Lcom/yandex/metrica/profile/BooleanAttribute;
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

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Lcom/yandex/metrica/impl/ob/ip;

    invoke-direct {v0, p1, p2, p3}, Lcom/yandex/metrica/impl/ob/ip;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V

    iput-object v0, p0, Lcom/yandex/metrica/profile/BooleanAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    return-void
.end method


# virtual methods
.method public withValue(Z)Lcom/yandex/metrica/profile/UserProfileUpdate;
    .locals 6
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/yandex/metrica/profile/UserProfileUpdate<",
            "+",
            "Lcom/yandex/metrica/impl/ob/jb;",
            ">;"
        }
    .end annotation

    .line 52
    new-instance v0, Lcom/yandex/metrica/profile/UserProfileUpdate;

    new-instance v1, Lcom/yandex/metrica/impl/ob/il;

    iget-object v2, p0, Lcom/yandex/metrica/profile/BooleanAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 54
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ip;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/yandex/metrica/profile/BooleanAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 56
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ip;->c()Lcom/yandex/metrica/impl/ob/nk;

    move-result-object v3

    new-instance v4, Lcom/yandex/metrica/impl/ob/im;

    iget-object v5, p0, Lcom/yandex/metrica/profile/BooleanAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 57
    invoke-virtual {v5}, Lcom/yandex/metrica/impl/ob/ip;->b()Lcom/yandex/metrica/impl/ob/ij;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/yandex/metrica/impl/ob/im;-><init>(Lcom/yandex/metrica/impl/ob/ij;)V

    invoke-direct {v1, v2, p1, v3, v4}, Lcom/yandex/metrica/impl/ob/il;-><init>(Ljava/lang/String;ZLcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/profile/UserProfileUpdate;-><init>(Lcom/yandex/metrica/impl/ob/jb;)V

    return-object v0
.end method

.method public withValueIfUndefined(Z)Lcom/yandex/metrica/profile/UserProfileUpdate;
    .locals 6
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/yandex/metrica/profile/UserProfileUpdate<",
            "+",
            "Lcom/yandex/metrica/impl/ob/jb;",
            ">;"
        }
    .end annotation

    .line 72
    new-instance v0, Lcom/yandex/metrica/profile/UserProfileUpdate;

    new-instance v1, Lcom/yandex/metrica/impl/ob/il;

    iget-object v2, p0, Lcom/yandex/metrica/profile/BooleanAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 74
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ip;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/yandex/metrica/profile/BooleanAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 76
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ip;->c()Lcom/yandex/metrica/impl/ob/nk;

    move-result-object v3

    new-instance v4, Lcom/yandex/metrica/impl/ob/iw;

    iget-object v5, p0, Lcom/yandex/metrica/profile/BooleanAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 77
    invoke-virtual {v5}, Lcom/yandex/metrica/impl/ob/ip;->b()Lcom/yandex/metrica/impl/ob/ij;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/yandex/metrica/impl/ob/iw;-><init>(Lcom/yandex/metrica/impl/ob/ij;)V

    invoke-direct {v1, v2, p1, v3, v4}, Lcom/yandex/metrica/impl/ob/il;-><init>(Ljava/lang/String;ZLcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/profile/UserProfileUpdate;-><init>(Lcom/yandex/metrica/impl/ob/jb;)V

    return-object v0
.end method

.method public withValueReset()Lcom/yandex/metrica/profile/UserProfileUpdate;
    .locals 6
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

    .line 89
    new-instance v0, Lcom/yandex/metrica/profile/UserProfileUpdate;

    new-instance v1, Lcom/yandex/metrica/impl/ob/iv;

    iget-object v2, p0, Lcom/yandex/metrica/profile/BooleanAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 92
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ip;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/yandex/metrica/profile/BooleanAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 93
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ip;->c()Lcom/yandex/metrica/impl/ob/nk;

    move-result-object v3

    iget-object v4, p0, Lcom/yandex/metrica/profile/BooleanAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 94
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/ip;->b()Lcom/yandex/metrica/impl/ob/ij;

    move-result-object v4

    const/4 v5, 0x3

    invoke-direct {v1, v5, v2, v3, v4}, Lcom/yandex/metrica/impl/ob/iv;-><init>(ILjava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/profile/UserProfileUpdate;-><init>(Lcom/yandex/metrica/impl/ob/jb;)V

    return-object v0
.end method
