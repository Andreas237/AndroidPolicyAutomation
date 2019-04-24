.class Lo/els$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ml;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/els;->d(Landroid/content/Context;ILjava/util/List;Z)Lo/ly;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/els;


# direct methods
.method constructor <init>(Lo/els;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lo/els$3;->b:Lo/els;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(FLcom/github/mikephil/charting/data/Entry;ILo/oa;)Ljava/lang/String;
    .locals 4

    .line 265
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
