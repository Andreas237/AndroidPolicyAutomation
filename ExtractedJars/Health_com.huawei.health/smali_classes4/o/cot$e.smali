.class Lo/cot$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final b:Lo/cot;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 33
    new-instance v0, Lo/cot;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cot;-><init>(Lo/cot$4;)V

    sput-object v0, Lo/cot$e;->b:Lo/cot;

    .line 34
    return-void
.end method
