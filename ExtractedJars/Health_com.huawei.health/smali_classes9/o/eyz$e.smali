.class Lo/eyz$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eyz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic e:Lo/eyz;


# direct methods
.method private constructor <init>(Lo/eyz;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lo/eyz$e;->e:Lo/eyz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/eyz;Lo/eyz$5;)V
    .locals 0

    .line 143
    invoke-direct {p0, p1}, Lo/eyz$e;-><init>(Lo/eyz;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 147
    iget-object v0, p0, Lo/eyz$e;->e:Lo/eyz;

    invoke-static {v0}, Lo/eyz;->d(Lo/eyz;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eyz$e;->e:Lo/eyz;

    invoke-static {v0}, Lo/eyz;->b(Lo/eyz;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    iget-object v0, p0, Lo/eyz$e;->e:Lo/eyz;

    invoke-static {v0}, Lo/eyz;->d(Lo/eyz;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 150
    :cond_0
    return-void
.end method
