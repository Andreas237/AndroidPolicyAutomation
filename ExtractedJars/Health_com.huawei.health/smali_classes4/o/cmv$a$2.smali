.class Lo/cmv$a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cmv$a;->c(Landroid/content/Context;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cmv$a;


# direct methods
.method constructor <init>(Lo/cmv$a;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lo/cmv$a$2;->e:Lo/cmv$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    .line 76
    iget-object v0, p0, Lo/cmv$a$2;->e:Lo/cmv$a;

    const/4 v1, 0x2

    invoke-static {v0, v1, p1}, Lo/cmv$a;->a(Lo/cmv$a;ILjava/lang/Object;)V

    .line 77
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 2

    .line 66
    iget-object v0, p0, Lo/cmv$a$2;->e:Lo/cmv$a;

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lo/cmv$a;->a(Lo/cmv$a;ILjava/lang/Object;)V

    .line 67
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 0

    .line 72
    return-void
.end method
