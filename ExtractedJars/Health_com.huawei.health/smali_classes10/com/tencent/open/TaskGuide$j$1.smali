.class Lcom/tencent/open/TaskGuide$j$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/TaskGuide$j;->a(Ljava/lang/Exception;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/open/TaskGuide$j;


# direct methods
.method constructor <init>(Lcom/tencent/open/TaskGuide$j;)V
    .locals 0

    .line 862
    iput-object p1, p0, Lcom/tencent/open/TaskGuide$j$1;->a:Lcom/tencent/open/TaskGuide$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 868
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$j$1;->a:Lcom/tencent/open/TaskGuide$j;

    iget-object v0, v0, Lcom/tencent/open/TaskGuide$j;->b:Lcom/tencent/open/TaskGuide;

    sget-object v1, Lcom/tencent/open/TaskGuide$k;->a:Lcom/tencent/open/TaskGuide$k;

    const/4 v2, 0x2

    invoke-static {v0, v2, v1}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;ILcom/tencent/open/TaskGuide$k;)V

    .line 869
    return-void
.end method
