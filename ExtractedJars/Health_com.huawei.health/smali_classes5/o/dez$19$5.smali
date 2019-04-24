.class Lo/dez$19$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dez$19;->d(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dez$19;


# direct methods
.method constructor <init>(Lo/dez$19;)V
    .locals 0

    .line 2861
    iput-object p1, p0, Lo/dez$19$5;->d:Lo/dez$19;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 2864
    const-string v0, "HWFitnessMgr"

    invoke-static {v0}, Lo/dgh;->e(Ljava/lang/String;)V

    .line 2865
    return-void
.end method
