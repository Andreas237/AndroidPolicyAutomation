.class Lo/dwr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwr;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dwr;

.field final synthetic e:Lo/dvu;


# direct methods
.method constructor <init>(Lo/dwr;Lo/dvu;)V
    .locals 0

    .line 985
    iput-object p1, p0, Lo/dwr$3;->b:Lo/dwr;

    iput-object p2, p0, Lo/dwr$3;->e:Lo/dvu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 987
    iget-object v0, p0, Lo/dwr$3;->b:Lo/dwr;

    iget-object v1, p0, Lo/dwr$3;->e:Lo/dvu;

    invoke-static {v0, v1}, Lo/dwr;->e(Lo/dwr;Lo/dvu;)V

    .line 988
    return-void
.end method
