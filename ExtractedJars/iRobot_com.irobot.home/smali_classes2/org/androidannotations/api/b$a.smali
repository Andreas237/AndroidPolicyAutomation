.class final Lorg/androidannotations/api/b$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/androidannotations/api/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field a:I

.field final b:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lorg/androidannotations/api/b$a;->a:I

    iput-object p1, p0, Lorg/androidannotations/api/b$a;->b:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lorg/androidannotations/api/b$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/androidannotations/api/b$a;-><init>(Ljava/lang/String;)V

    return-void
.end method
