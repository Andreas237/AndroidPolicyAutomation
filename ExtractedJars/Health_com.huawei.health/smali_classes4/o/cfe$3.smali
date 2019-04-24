.class Lo/cfe$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elb$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cfe;->d(Lo/ekw;Lo/elb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cfe;


# direct methods
.method constructor <init>(Lo/cfe;)V
    .locals 0

    .line 323
    iput-object p1, p0, Lo/cfe$3;->e:Lo/cfe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(III)Z
    .locals 1

    .line 327
    sub-int v0, p2, p1

    if-le v0, p3, :cond_0

    .line 328
    const/4 v0, 0x0

    return v0

    .line 330
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
