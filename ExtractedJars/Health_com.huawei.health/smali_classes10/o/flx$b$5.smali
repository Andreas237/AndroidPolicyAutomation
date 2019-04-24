.class Lo/flx$b$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/flx$b;->c(Lo/fpd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fpd;

.field final synthetic e:Lo/flx$b;


# direct methods
.method constructor <init>(Lo/flx$b;Lo/fpd;)V
    .locals 0

    .line 768
    iput-object p1, p0, Lo/flx$b$5;->e:Lo/flx$b;

    iput-object p2, p0, Lo/flx$b$5;->c:Lo/fpd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 771
    iget-object v0, p0, Lo/flx$b$5;->e:Lo/flx$b;

    iget-object v1, p0, Lo/flx$b$5;->c:Lo/fpd;

    invoke-static {v0, v1}, Lo/flx$b;->c(Lo/flx$b;Lo/fpd;)V

    .line 772
    return-void
.end method
