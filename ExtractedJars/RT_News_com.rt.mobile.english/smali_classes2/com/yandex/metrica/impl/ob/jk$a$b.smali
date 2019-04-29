.class public Lcom/yandex/metrica/impl/ob/jk$a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jk$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/jk$a$b$a;
    }
.end annotation


# instance fields
.field a:[B
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field b:[B
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final c:Lcom/yandex/metrica/impl/ob/jk$a$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private d:Lcom/yandex/metrica/impl/ob/jk$a$b$a;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private e:Lcom/yandex/metrica/impl/as$a;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private f:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private g:Ljava/util/Map;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/Exception;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/jk$a$a;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/jk$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->c:Lcom/yandex/metrica/impl/ob/jk$a$a;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/jk$a$b;)Lcom/yandex/metrica/impl/ob/jk$a$a;
    .locals 0

    .line 96
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->c:Lcom/yandex/metrica/impl/ob/jk$a$a;

    return-object p0
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/jk$a$a;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 128
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->c:Lcom/yandex/metrica/impl/ob/jk$a$a;

    return-object v0
.end method

.method public a(Lcom/yandex/metrica/impl/as$a;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/as$a;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 146
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->e:Lcom/yandex/metrica/impl/as$a;

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jk$a$b$a;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/jk$a$b$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 137
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->d:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    return-void
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 0
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 182
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->h:Ljava/lang/Exception;

    return-void
.end method

.method public a(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 155
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->f:Ljava/lang/Integer;

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 0
    .param p1    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 173
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->g:Ljava/util/Map;

    return-void
.end method

.method public a([B)V
    .locals 0
    .param p1    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 164
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->a:[B

    return-void
.end method

.method public b()Lcom/yandex/metrica/impl/ob/jk$a$b$a;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 133
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->d:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    return-object v0
.end method

.method public b([B)V
    .locals 0
    .param p1    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 191
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->b:[B

    return-void
.end method

.method public c()Lcom/yandex/metrica/impl/as$a;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 142
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->e:Lcom/yandex/metrica/impl/as$a;

    return-object v0
.end method

.method public d()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public e()[B
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 160
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->a:[B

    return-object v0
.end method

.method public f()Ljava/util/Map;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 169
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->g:Ljava/util/Map;

    return-object v0
.end method

.method public g()Ljava/lang/Exception;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 178
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->h:Ljava/lang/Exception;

    return-object v0
.end method

.method public h()[B
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 187
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk$a$b;->b:[B

    return-object v0
.end method
