.class Lo/cbu$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dhj;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbu;->i(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cbu;


# direct methods
.method constructor <init>(Lo/cbu;)V
    .locals 0

    .line 4597
    iput-object p1, p0, Lo/cbu$5;->a:Lo/cbu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/location/Location;)V
    .locals 1

    .line 4600
    iget-object v0, p0, Lo/cbu$5;->a:Lo/cbu;

    invoke-virtual {v0, p1}, Lo/cbu;->b(Landroid/location/Location;)V

    .line 4601
    return-void
.end method
