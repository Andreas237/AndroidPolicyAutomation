.class public Lcom/yandex/metrica/impl/ob/il;
.super Lcom/yandex/metrica/impl/ob/in;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/in<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/nk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/ik;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/ik;",
            ")V"
        }
    .end annotation

    .line 25
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v1, 0x3

    move-object v0, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    .line 22
    invoke-direct/range {v0 .. v5}, Lcom/yandex/metrica/impl/ob/in;-><init>(ILjava/lang/String;Ljava/lang/Object;Lcom/yandex/metrica/impl/ob/nk;Lcom/yandex/metrica/impl/ob/ik;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/yandex/metrica/impl/ob/jg$a$a;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jg$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 33
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jg$a$a;->e:Lcom/yandex/metrica/impl/ob/jg$a$c;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/il;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p1, Lcom/yandex/metrica/impl/ob/jg$a$c;->e:Z

    return-void
.end method
