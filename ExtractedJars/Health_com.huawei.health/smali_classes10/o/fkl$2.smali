.class final Lo/fkl$2;
.super Ljava/lang/Object;

# interfaces
.implements Lo/fkj;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fkl;->b(Ljava/lang/String;Lo/fkk;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fkk;


# direct methods
.method constructor <init>(Lo/fkk;)V
    .locals 0

    iput-object p1, p0, Lo/fkl$2;->c:Lo/fkk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lo/fkl$2;->c:Lo/fkk;

    invoke-static {p1, v0}, Lo/fkl;->a(Ljava/lang/String;Lo/fkk;)V

    return-void
.end method
