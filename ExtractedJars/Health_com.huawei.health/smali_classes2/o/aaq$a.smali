.class Lo/aaq$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aaq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final d:Lo/aaq;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 50
    new-instance v0, Lo/aaq;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/aaq;-><init>(Lo/aaq;)V

    sput-object v0, Lo/aaq$a;->d:Lo/aaq;

    return-void
.end method
