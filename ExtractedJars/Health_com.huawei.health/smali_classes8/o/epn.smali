.class public Lo/epn;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/epn$d;,
        Lo/epn$a;
    }
.end annotation


# instance fields
.field private e:Lo/eps;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param

    .line 43
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epn;->e:Lo/eps;

    .line 44
    return-void
.end method

.method static synthetic a(Lo/epn;Lo/eps;)Lo/eps;
    .locals 0

    .line 32
    iput-object p1, p0, Lo/epn;->e:Lo/eps;

    return-object p1
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;>;)V"
        }
    .end annotation

    .line 123
    iget-object v0, p0, Lo/epn;->e:Lo/eps;

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lo/epn;->e:Lo/eps;

    invoke-virtual {v0, p1, p2}, Lo/eps;->setDataContent(Ljava/util/List;Ljava/util/Map;)V

    .line 126
    :cond_0
    return-void
.end method

.method public c(II)V
    .locals 1

    .line 129
    iget-object v0, p0, Lo/epn;->e:Lo/eps;

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lo/epn;->e:Lo/eps;

    invoke-virtual {v0, p1, p2}, Lo/eps;->b(II)V

    .line 132
    :cond_0
    return-void
.end method
