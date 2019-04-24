.class Lo/efb$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/efi$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/efb;->d(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/efb;


# direct methods
.method constructor <init>(Lo/efb;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lo/efb$2;->d:Lo/efb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 42
    iget-object v0, p0, Lo/efb$2;->d:Lo/efb;

    invoke-virtual {v0}, Lo/efb;->requestRender()V

    .line 43
    return-void
.end method
