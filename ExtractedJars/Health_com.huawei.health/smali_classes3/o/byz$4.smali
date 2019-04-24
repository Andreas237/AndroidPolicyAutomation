.class Lo/byz$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bzc$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/byz;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/byz;


# direct methods
.method constructor <init>(Lo/byz;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/byz$4;->a:Lo/byz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)Ljava/lang/String;
    .locals 1

    .line 68
    if-nez p1, :cond_0

    iget-object v0, p0, Lo/byz$4;->a:Lo/byz;

    invoke-static {v0}, Lo/byz;->b(Lo/byz;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/byz$4;->a:Lo/byz;

    invoke-static {v0}, Lo/byz;->a(Lo/byz;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 63
    const/4 v0, 0x2

    return v0
.end method
