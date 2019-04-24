.class Lo/eya$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elb$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eya;->e(Lo/ekw;Lo/eic;Lo/ehe$a;)Lo/elb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eya;


# direct methods
.method constructor <init>(Lo/eya;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/eya$5;->b:Lo/eya;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(III)Z
    .locals 2

    .line 62
    sub-int v0, p2, p1

    const/16 v1, 0x23

    if-le v0, v1, :cond_0

    .line 63
    const/4 v0, 0x0

    return v0

    .line 65
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
