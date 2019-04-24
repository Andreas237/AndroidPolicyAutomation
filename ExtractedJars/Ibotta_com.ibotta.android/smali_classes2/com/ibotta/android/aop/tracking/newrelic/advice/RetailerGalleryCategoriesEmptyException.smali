.class public Lcom/ibotta/android/aop/tracking/newrelic/advice/RetailerGalleryCategoriesEmptyException;
.super Ljava/lang/RuntimeException;
.source "RetailerGalleryCategoriesEmptyException.java"


# static fields
.field private static final MESSAGE:Ljava/lang/String; = "Retailer Gallery found to be empty: %1$d"


# direct methods
.method public constructor <init>(I)V
    .locals 3

    const-string v0, "Retailer Gallery found to be empty: %1$d"

    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-void
.end method
