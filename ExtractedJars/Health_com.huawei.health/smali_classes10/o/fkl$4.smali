.class final Lo/fkl$4;
.super Ljava/lang/Object;

# interfaces
.implements Lo/fkk;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fkl;->a(Ljava/lang/String;Lo/fkk;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fkk;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lo/fkk;)V
    .locals 0

    iput-object p1, p0, Lo/fkl$4;->c:Ljava/lang/String;

    iput-object p2, p0, Lo/fkl$4;->b:Lo/fkk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lo/fkl$4;->b:Lo/fkk;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fkl$4;->b:Lo/fkk;

    invoke-interface {v0, p1, p2}, Lo/fkk;->b(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lo/fkl$4;->c:Ljava/lang/String;

    iget-object v1, p0, Lo/fkl$4;->b:Lo/fkk;

    invoke-static {v0, v1}, Lo/fkl;->a(Ljava/lang/String;Lo/fkk;)V

    return-void
.end method
