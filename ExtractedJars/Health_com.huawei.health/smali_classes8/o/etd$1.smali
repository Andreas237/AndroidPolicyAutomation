.class Lo/etd$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/etd;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/etd;


# direct methods
.method constructor <init>(Lo/etd;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lo/etd$1;->b:Lo/etd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 123
    iget-object v0, p0, Lo/etd$1;->b:Lo/etd;

    invoke-static {v0}, Lo/etd;->d(Lo/etd;)V

    .line 124
    return-void
.end method
