.class Lo/agn$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/agn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/agn;


# direct methods
.method constructor <init>(Lo/agn;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lo/agn$2;->a:Lo/agn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 225
    iget-object v0, p0, Lo/agn$2;->a:Lo/agn;

    invoke-static {v0}, Lo/agn;->o(Lo/agn;)V

    .line 226
    return-void
.end method
