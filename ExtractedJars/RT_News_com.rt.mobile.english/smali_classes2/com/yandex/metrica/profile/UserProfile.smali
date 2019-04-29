.class public Lcom/yandex/metrica/profile/UserProfile;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/profile/UserProfile$Builder;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yandex/metrica/profile/UserProfileUpdate<",
            "+",
            "Lcom/yandex/metrica/impl/ob/jb;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/profile/UserProfileUpdate<",
            "+",
            "Lcom/yandex/metrica/impl/ob/jb;",
            ">;>;)V"
        }
    .end annotation

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/profile/UserProfile;->a:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;B)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/yandex/metrica/profile/UserProfile;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public static newBuilder()Lcom/yandex/metrica/profile/UserProfile$Builder;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 64
    new-instance v0, Lcom/yandex/metrica/profile/UserProfile$Builder;

    invoke-direct {v0}, Lcom/yandex/metrica/profile/UserProfile$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public getUserProfileUpdates()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/profile/UserProfileUpdate<",
            "+",
            "Lcom/yandex/metrica/impl/ob/jb;",
            ">;>;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/yandex/metrica/profile/UserProfile;->a:Ljava/util/List;

    return-object v0
.end method
