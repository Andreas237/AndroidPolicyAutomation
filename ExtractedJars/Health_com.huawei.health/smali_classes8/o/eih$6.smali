.class Lo/eih$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eih;->getShowDataTotal()F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eih;


# direct methods
.method constructor <init>(Lo/eih;)V
    .locals 0

    .line 1050
    iput-object p1, p0, Lo/eih$6;->b:Lo/eih;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)F
    .locals 1

    .line 1053
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method
