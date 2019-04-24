.class Lo/exl$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exl;->b(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egg;

.field final synthetic d:Lo/exl;


# direct methods
.method constructor <init>(Lo/exl;Lo/egg;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lo/exl$7;->d:Lo/exl;

    iput-object p2, p0, Lo/exl$7;->b:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 2

    .line 156
    iget-object v0, p0, Lo/exl$7;->d:Lo/exl;

    invoke-static {v0}, Lo/exl;->d(Lo/exl;)I

    .line 157
    iget-object v0, p0, Lo/exl$7;->b:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/exl$7;->d:Lo/exl;

    invoke-static {v0}, Lo/exl;->c(Lo/exl;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_0

    .line 158
    iget-object v0, p0, Lo/exl$7;->b:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 160
    :cond_0
    return-void
.end method
