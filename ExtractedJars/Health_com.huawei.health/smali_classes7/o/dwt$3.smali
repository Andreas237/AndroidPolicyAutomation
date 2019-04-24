.class Lo/dwt$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwt;->a(Lo/dwk;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dwt;

.field final synthetic e:Lo/dvl;


# direct methods
.method constructor <init>(Lo/dwt;Lo/dvl;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lo/dwt$3;->b:Lo/dwt;

    iput-object p2, p0, Lo/dwt$3;->e:Lo/dvl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 119
    iget-object v0, p0, Lo/dwt$3;->b:Lo/dwt;

    iget-object v1, p0, Lo/dwt$3;->e:Lo/dvl;

    invoke-static {v0, v1}, Lo/dwt;->a(Lo/dwt;Lo/dvl;)V

    .line 120
    return-void
.end method
