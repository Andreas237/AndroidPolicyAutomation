.class final Lo/dzr$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dzr;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/egv;


# direct methods
.method constructor <init>(Lo/egv;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lo/dzr$2;->e:Lo/egv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 284
    iget-object v0, p0, Lo/dzr$2;->e:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 285
    iget-object v0, p0, Lo/dzr$2;->e:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 287
    :cond_0
    return-void
.end method
