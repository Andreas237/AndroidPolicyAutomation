.class public Lcom/yandex/metrica/profile/GenderAttribute;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/profile/GenderAttribute$Gender;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ip;


# direct methods
.method constructor <init>()V
    .locals 4

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lcom/yandex/metrica/impl/ob/ip;

    const-string v1, "appmetrica_gender"

    new-instance v2, Lcom/yandex/metrica/impl/ob/nd;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/nd;-><init>()V

    new-instance v3, Lcom/yandex/metrica/impl/ob/ix;

    invoke-direct {v3}, Lcom/yandex/metrica/impl/ob/ix;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/ob/ip;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V

    iput-object v0, p0, Lcom/yandex/metrica/profile/GenderAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    return-void
.end method


# virtual methods
.method public withValue(Lcom/yandex/metrica/profile/GenderAttribute$Gender;)Lcom/yandex/metrica/profile/UserProfileUpdate;
    .locals 8
    .param p1    # Lcom/yandex/metrica/profile/GenderAttribute$Gender;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/profile/GenderAttribute$Gender;",
            ")",
            "Lcom/yandex/metrica/profile/UserProfileUpdate<",
            "+",
            "Lcom/yandex/metrica/impl/ob/jb;",
            ">;"
        }
    .end annotation

    .line 64
    new-instance v0, Lcom/yandex/metrica/profile/UserProfileUpdate;

    new-instance v7, Lcom/yandex/metrica/impl/ob/iy;

    iget-object v1, p0, Lcom/yandex/metrica/profile/GenderAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 66
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ip;->a()Ljava/lang/String;

    move-result-object v2

    .line 67
    invoke-virtual {p1}, Lcom/yandex/metrica/profile/GenderAttribute$Gender;->getStringValue()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/yandex/metrica/impl/ob/mv;

    invoke-direct {v4}, Lcom/yandex/metrica/impl/ob/mv;-><init>()V

    iget-object p1, p0, Lcom/yandex/metrica/profile/GenderAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 69
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ip;->c()Lcom/yandex/metrica/impl/ob/nk;

    move-result-object v5

    new-instance v6, Lcom/yandex/metrica/impl/ob/im;

    iget-object p1, p0, Lcom/yandex/metrica/profile/GenderAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 70
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ip;->b()Lcom/yandex/metrica/impl/ob/ij;

    move-result-object p1

    invoke-direct {v6, p1}, Lcom/yandex/metrica/impl/ob/im;-><init>(Lcom/yandex/metrica/impl/ob/ij;)V

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/yandex/metrica/impl/ob/iy;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/nc;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V

    invoke-direct {v0, v7}, Lcom/yandex/metrica/profile/UserProfileUpdate;-><init>(Lcom/yandex/metrica/impl/ob/jb;)V

    return-object v0
.end method

.method public withValueIfUndefined(Lcom/yandex/metrica/profile/GenderAttribute$Gender;)Lcom/yandex/metrica/profile/UserProfileUpdate;
    .locals 8
    .param p1    # Lcom/yandex/metrica/profile/GenderAttribute$Gender;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/profile/GenderAttribute$Gender;",
            ")",
            "Lcom/yandex/metrica/profile/UserProfileUpdate<",
            "+",
            "Lcom/yandex/metrica/impl/ob/jb;",
            ">;"
        }
    .end annotation

    .line 86
    new-instance v0, Lcom/yandex/metrica/profile/UserProfileUpdate;

    new-instance v7, Lcom/yandex/metrica/impl/ob/iy;

    iget-object v1, p0, Lcom/yandex/metrica/profile/GenderAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 88
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ip;->a()Ljava/lang/String;

    move-result-object v2

    .line 89
    invoke-virtual {p1}, Lcom/yandex/metrica/profile/GenderAttribute$Gender;->getStringValue()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/yandex/metrica/impl/ob/mv;

    invoke-direct {v4}, Lcom/yandex/metrica/impl/ob/mv;-><init>()V

    iget-object p1, p0, Lcom/yandex/metrica/profile/GenderAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 91
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ip;->c()Lcom/yandex/metrica/impl/ob/nk;

    move-result-object v5

    new-instance v6, Lcom/yandex/metrica/impl/ob/iw;

    iget-object p1, p0, Lcom/yandex/metrica/profile/GenderAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 92
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ip;->b()Lcom/yandex/metrica/impl/ob/ij;

    move-result-object p1

    invoke-direct {v6, p1}, Lcom/yandex/metrica/impl/ob/iw;-><init>(Lcom/yandex/metrica/impl/ob/ij;)V

    move-object v1, v7

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

    .line 104
    new-instance v0, Lcom/yandex/metrica/profile/UserProfileUpdate;

    new-instance v1, Lcom/yandex/metrica/impl/ob/iv;

    iget-object v2, p0, Lcom/yandex/metrica/profile/GenderAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 106
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ip;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/yandex/metrica/profile/GenderAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 107
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ip;->c()Lcom/yandex/metrica/impl/ob/nk;

    move-result-object v3

    iget-object v4, p0, Lcom/yandex/metrica/profile/GenderAttribute;->a:Lcom/yandex/metrica/impl/ob/ip;

    .line 108
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/ip;->b()Lcom/yandex/metrica/impl/ob/ij;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v1, v5, v2, v3, v4}, Lcom/yandex/metrica/impl/ob/iv;-><init>(ILjava/lang/String;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ij;)V

    invoke-direct {v0, v1}, Lcom/yandex/metrica/profile/UserProfileUpdate;-><init>(Lcom/yandex/metrica/impl/ob/jb;)V

    return-object v0
.end method
