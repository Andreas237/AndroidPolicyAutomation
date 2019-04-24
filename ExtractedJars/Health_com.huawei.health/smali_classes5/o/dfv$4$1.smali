.class Lo/dfv$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dfv$4;->d(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dfv$4;


# direct methods
.method constructor <init>(Lo/dfv$4;)V
    .locals 0

    .line 1396
    iput-object p1, p0, Lo/dfv$4$1;->b:Lo/dfv$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1399
    const-string v0, "HWFitnessAW70Mgr"

    invoke-static {v0}, Lo/dgh;->e(Ljava/lang/String;)V

    .line 1400
    return-void
.end method
