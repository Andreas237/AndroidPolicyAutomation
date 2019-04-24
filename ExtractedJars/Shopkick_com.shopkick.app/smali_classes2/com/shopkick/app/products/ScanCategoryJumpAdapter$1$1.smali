.class Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1$1;
.super Ljava/util/HashMap;
.source "ScanCategoryJumpAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static final FEATURED_SCANS_SECTION_SORT_OVERRIDE:Ljava/lang/String; = "1"

.field private static final MORE_SCANS_SECTION_SORT_OVERRIDE:Ljava/lang/String; = "3"

.field private static final OTHER_SECTION_SORT_OVERRIDE:Ljava/lang/String; = "2"

.field private static final SCAN_MISSION_SECTION_SORT_OVERRIDE:Ljava/lang/String; = "0"


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;)V
    .locals 1

    .line 131
    iput-object p1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1$1;->this$1:Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string p1, "MISSION"

    const-string v0, "0"

    .line 139
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "FEATURED"

    const-string v0, "1"

    .line 140
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "UNCATEGORIZED"

    const-string v0, "3"

    .line 141
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 131
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1$1;->get(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 146
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1$1;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p1, "2"

    :goto_0
    return-object p1
.end method
