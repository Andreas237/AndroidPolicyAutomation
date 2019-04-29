.class public Lcom/yandex/metrica/profile/StringAttribute;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/nc;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nc<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/ip;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nc;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/nc;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/nk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/ij;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/nc<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/ij;",
            ")V"
        }
    .end annotation

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Lcom/yandex/metrica/impl/ob/ip;

    invoke-direct {v0, p1, p3, p4}, Lcom/yandex/metrica/impl/ob/ip;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V

    iput-object v0, p0, Lcom/yandex/metrica/profile/StringAttribute;->b:Lcom/yandex/metrica/impl/ob/ip;

    .line 45
    iput-object p2, p0, Lcom/yandex/metrica/profile/StringAttribute;->a:Lcom/yandex/metrica/impl/ob/nc;

    return-void
.end method


# virtual methods
.method public withValue(Ljava/lang/String;)Lcom/yandex/metrica/profile/UserProfileUpdate;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/yandex/metrica/profile/UserProfileUpdate<",
            "+",
            "Lcom/yandex/metrica/impl/ob/jb;",
            ">;"
        }
    .end annotation

    .line 57
    new-instance v0, Lcom/yandex/metrica/profile/UserProfileUpdate;

    new-instance v7, Lcom/yandex/metrica/impl/ob/iy;

    iget-object v1, p0, Lcom/yandex/metrica/profile/StringAttribute;->b:Lcom/yandex/metrica/impl/ob/ip;

    .line 59
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ip;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/yandex/metrica/profile/StringAttribute;->a:Lcom/yandex/metrica/impl/ob/nc;

    iget-object v1, p0, Lcom/yandex/metrica/profile/StringAttribute;->b:Lcom/yandex/metrica/impl/ob/ip;

    .line 62
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ip;->c()Lcom/yandex/metrica/impl/ob/nk;

    move-result-object v5

    new-instance v6, Lcom/yandex/metrica/impl/ob/im;

    iget-object v1, p0, Lcom/yandex/metrica/profile/StringAttribute;->b:Lcom/yandex/metrica/impl/ob/ip;

    .line 63
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ip;->b()Lcom/yandex/metrica/impl/ob/ij;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/yandex/metrica/impl/ob/im;-><init>(Lcom/yandex/metrica/impl/ob/ij;)V

    move-object v1, v7

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/yandex/metrica/impl/ob/iy;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nc;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V

    invoke-direct {v0, v7}, Lcom/yandex/metrica/profile/UserProfileUpdate;-><init>(Lcom/yandex/metrica/impl/ob/jb;)V

    return-object v0
.end method

.method public withValueIfUndefined(Ljava/lang/String;)Lcom/yandex/metrica/profile/UserProfileUpdate;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/yandex/metrica/profile/UserProfileUpdate<",
            "+",
            "Lcom/yandex/metrica/impl/ob/jb;",
            ">;"
        }
    .end annotation

    .line 78
    new-instance v0, Lcom/yandex/metrica/profile/UserProfileUpdate;

    new-instance v7, Lcom/yandex/metrica/impl/ob/iy;

    iget-object v1, p0, Lcom/yandex/metrica/profile/StringAttribute;->b:Lcom/yandex/metrica/impl/ob/ip;

    .line 80
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ip;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/yandex/metrica/profile/StringAttribute;->a:Lcom/yandex/metrica/impl/ob/nc;

    iget-object v1, p0, Lcom/yandex/metrica/profile/StringAttribute;->b:Lcom/yandex/metrica/impl/ob/ip;

    .line 83
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ip;->c()Lcom/yandex/metrica/impl/ob/nk;

    move-result-object v5

    new-instance v6, Lcom/yandex/metrica/impl/ob/iw;

    iget-object v1, p0, Lcom/yandex/metrica/profile/StringAttribute;->b:Lcom/yandex/metrica/impl/ob/ip;

    .line 84
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ip;->b()Lcom/yandex/metrica/impl/ob/ij;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/yandex/metrica/impl/ob/iw;-><init>(Lcom/yandex/metrica/impl/ob/ij;)V

    move-object v1, v7

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/yandex/metrica/impl/ob/iy;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nc;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V

    invoke-direct {v0, v7}, Lcom/yandex/metrica/profile/UserProfileUpdate;-><init>(Lcom/yandex/metrica/impl/ob/jb;)V

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

    .line 96
    new-instance v0, Lcom/yandex/metrica/profile/UserProfileUpdate;

    new-instance v1, Lcom/yandex/metrica/impl/ob/iv;

    iget-object v2, p0, Lcom/yandex/metrica/profile/StringAttribute;->b:Lcom/yandex/metrica/impl/ob/ip;

    .line 99
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ip;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/yandex/metrica/profile/StringAttribute;->b:Lcom/yandex/metrica/impl/ob/ip;

    .line 100
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ip;->c()Lcom/yandex/metrica/impl/ob/nk;

    move-result-object v3

    iget-object v4, p0, Lcom/yandex/metrica/profile/StringAttribute;->b:Lcom/yandex/metrica/impl/ob/ip;

    .line 101
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/ip;->b()Lcom/yandex/metrica/impl/ob/ij;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v1, v5, v2, v3, v4}, Lcom/yandex/metrica/impl/ob/iv;-><init>(ILjava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/profile/UserProfileUpdate;-><init>(Lcom/yandex/metrica/impl/ob/jb;)V

    return-object v0
.end method
