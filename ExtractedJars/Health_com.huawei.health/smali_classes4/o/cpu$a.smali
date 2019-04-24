.class Lo/cpu$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final d:Lo/cpu;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Lo/cpu;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpu;-><init>(Lo/cpu$5;)V

    sput-object v0, Lo/cpu$a;->d:Lo/cpu;

    .line 38
    return-void
.end method
