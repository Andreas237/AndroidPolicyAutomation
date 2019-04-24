.class Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;
.super Landroid/view/LayoutInflater;
.source "CalligraphyLayoutInflater.java"

# interfaces
.implements Luk/co/chrisjenx/calligraphy/CalligraphyActivityFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$PrivateWrapperFactory2;,
        Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory2;,
        Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;
    }
.end annotation


# static fields
.field private static final sClassPrefixList:[Ljava/lang/String;


# instance fields
.field private final mAttributeId:I

.field private final mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

.field private mConstructorArgs:Ljava/lang/reflect/Field;

.field private mSetPrivateFactory:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 22
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "android.widget."

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "android.webkit."

    aput-object v2, v0, v1

    sput-object v0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->sClassPrefixList:[Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attributeId"    # I

    .prologue
    const/4 v1, 0x0

    .line 34
    invoke-direct {p0, p1}, Landroid/view/LayoutInflater;-><init>(Landroid/content/Context;)V

    .line 30
    iput-boolean v1, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mSetPrivateFactory:Z

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mConstructorArgs:Ljava/lang/reflect/Field;

    .line 35
    iput p2, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mAttributeId:I

    .line 36
    new-instance v0, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    invoke-direct {v0, p2}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;-><init>(I)V

    iput-object v0, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    .line 37
    invoke-direct {p0, v1}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->setUpLayoutFactories(Z)V

    .line 38
    return-void
.end method

.method protected constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;IZ)V
    .locals 1
    .param p1, "original"    # Landroid/view/LayoutInflater;
    .param p2, "newContext"    # Landroid/content/Context;
    .param p3, "attributeId"    # I
    .param p4, "cloned"    # Z

    .prologue
    .line 41
    invoke-direct {p0, p1, p2}, Landroid/view/LayoutInflater;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;)V

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mSetPrivateFactory:Z

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mConstructorArgs:Ljava/lang/reflect/Field;

    .line 42
    iput p3, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mAttributeId:I

    .line 43
    new-instance v0, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    invoke-direct {v0, p3}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;-><init>(I)V

    iput-object v0, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    .line 44
    invoke-direct {p0, p4}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->setUpLayoutFactories(Z)V

    .line 45
    return-void
.end method

.method static synthetic access$000(Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;Landroid/view/View;Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1
    .param p0, "x0"    # Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;
    .param p1, "x1"    # Landroid/view/View;
    .param p2, "x2"    # Landroid/view/View;
    .param p3, "x3"    # Ljava/lang/String;
    .param p4, "x4"    # Landroid/content/Context;
    .param p5, "x5"    # Landroid/util/AttributeSet;

    .prologue
    .line 20
    invoke-direct/range {p0 .. p5}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->createCustomViewInternal(Landroid/view/View;Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private createCustomViewInternal(Landroid/view/View;Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 6
    .param p1, "parent"    # Landroid/view/View;
    .param p2, "view"    # Landroid/view/View;
    .param p3, "name"    # Ljava/lang/String;
    .param p4, "viewContext"    # Landroid/content/Context;
    .param p5, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v5, 0x0

    .line 198
    invoke-static {}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->get()Luk/co/chrisjenx/calligraphy/CalligraphyConfig;

    move-result-object v3

    invoke-virtual {v3}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->isCustomViewCreation()Z

    move-result v3

    if-nez v3, :cond_0

    move-object v2, p2

    .line 218
    .end local p2    # "view":Landroid/view/View;
    .local v2, "view":Landroid/view/View;
    :goto_0
    return-object v2

    .line 199
    .end local v2    # "view":Landroid/view/View;
    .restart local p2    # "view":Landroid/view/View;
    :cond_0
    if-nez p2, :cond_2

    const/16 v3, 0x2e

    invoke-virtual {p3, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-le v3, v4, :cond_2

    .line 200
    iget-object v3, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mConstructorArgs:Ljava/lang/reflect/Field;

    if-nez v3, :cond_1

    .line 201
    const-class v3, Landroid/view/LayoutInflater;

    const-string v4, "mConstructorArgs"

    invoke-static {v3, v4}, Luk/co/chrisjenx/calligraphy/ReflectionUtils;->getField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    iput-object v3, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mConstructorArgs:Ljava/lang/reflect/Field;

    .line 203
    :cond_1
    iget-object v3, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mConstructorArgs:Ljava/lang/reflect/Field;

    invoke-static {v3, p0}, Luk/co/chrisjenx/calligraphy/ReflectionUtils;->getValue(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/Object;

    move-object v1, v3

    check-cast v1, [Ljava/lang/Object;

    .line 204
    .local v1, "mConstructorArgsArr":[Ljava/lang/Object;
    aget-object v0, v1, v5

    .line 208
    .local v0, "lastContext":Ljava/lang/Object;
    aput-object p4, v1, v5

    .line 209
    iget-object v3, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mConstructorArgs:Ljava/lang/reflect/Field;

    invoke-static {v3, p0, v1}, Luk/co/chrisjenx/calligraphy/ReflectionUtils;->setValue(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 211
    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p0, p3, v3, p5}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->createView(Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object p2

    .line 214
    aput-object v0, v1, v5

    .line 215
    iget-object v3, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mConstructorArgs:Ljava/lang/reflect/Field;

    invoke-static {v3, p0, v1}, Luk/co/chrisjenx/calligraphy/ReflectionUtils;->setValue(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)V

    .end local v0    # "lastContext":Ljava/lang/Object;
    .end local v1    # "mConstructorArgsArr":[Ljava/lang/Object;
    :cond_2
    :goto_1
    move-object v2, p2

    .line 218
    .end local p2    # "view":Landroid/view/View;
    .restart local v2    # "view":Landroid/view/View;
    goto :goto_0

    .line 212
    .end local v2    # "view":Landroid/view/View;
    .restart local v0    # "lastContext":Ljava/lang/Object;
    .restart local v1    # "mConstructorArgsArr":[Ljava/lang/Object;
    .restart local p2    # "view":Landroid/view/View;
    :catch_0
    move-exception v3

    .line 214
    aput-object v0, v1, v5

    .line 215
    iget-object v3, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mConstructorArgs:Ljava/lang/reflect/Field;

    invoke-static {v3, p0, v1}, Luk/co/chrisjenx/calligraphy/ReflectionUtils;->setValue(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    .line 214
    :catchall_0
    move-exception v3

    aput-object v0, v1, v5

    .line 215
    iget-object v4, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mConstructorArgs:Ljava/lang/reflect/Field;

    invoke-static {v4, p0, v1}, Luk/co/chrisjenx/calligraphy/ReflectionUtils;->setValue(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)V

    throw v3
.end method

.method private setPrivateFactoryInternal()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 106
    iget-boolean v1, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mSetPrivateFactory:Z

    if-eqz v1, :cond_1

    .line 124
    :cond_0
    :goto_0
    return-void

    .line 108
    :cond_1
    invoke-static {}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->get()Luk/co/chrisjenx/calligraphy/CalligraphyConfig;

    move-result-object v1

    invoke-virtual {v1}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->isReflection()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 110
    invoke-virtual {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/view/LayoutInflater$Factory2;

    if-nez v1, :cond_2

    .line 111
    iput-boolean v6, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mSetPrivateFactory:Z

    goto :goto_0

    .line 115
    :cond_2
    const-class v1, Landroid/view/LayoutInflater;

    const-string v2, "setPrivateFactory"

    .line 116
    invoke-static {v1, v2}, Luk/co/chrisjenx/calligraphy/ReflectionUtils;->getMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 118
    .local v0, "setPrivateFactoryMethod":Ljava/lang/reflect/Method;
    if-eqz v0, :cond_3

    .line 119
    new-array v2, v6, [Ljava/lang/Object;

    const/4 v3, 0x0

    new-instance v4, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$PrivateWrapperFactory2;

    .line 121
    invoke-virtual {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater$Factory2;

    iget-object v5, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    invoke-direct {v4, v1, p0, v5}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$PrivateWrapperFactory2;-><init>(Landroid/view/LayoutInflater$Factory2;Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;Luk/co/chrisjenx/calligraphy/CalligraphyFactory;)V

    aput-object v4, v2, v3

    .line 119
    invoke-static {p0, v0, v2}, Luk/co/chrisjenx/calligraphy/ReflectionUtils;->invokeMethod(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    .line 123
    :cond_3
    iput-boolean v6, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mSetPrivateFactory:Z

    goto :goto_0
.end method

.method private setUpLayoutFactories(Z)V
    .locals 2
    .param p1, "cloned"    # Z

    .prologue
    .line 68
    if-eqz p1, :cond_1

    .line 80
    :cond_0
    :goto_0
    return-void

    .line 70
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_2

    .line 71
    invoke-virtual {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    instance-of v0, v0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory2;

    if-nez v0, :cond_2

    .line 73
    invoke-virtual {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    invoke-virtual {p0, v0}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 77
    :cond_2
    invoke-virtual {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v0

    instance-of v0, v0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;

    if-nez v0, :cond_0

    .line 78
    invoke-virtual {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v0

    invoke-virtual {p0, v0}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    goto :goto_0
.end method


# virtual methods
.method public cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;
    .locals 3
    .param p1, "newContext"    # Landroid/content/Context;

    .prologue
    .line 49
    new-instance v0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;

    iget v1, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mAttributeId:I

    const/4 v2, 0x1

    invoke-direct {v0, p0, p1, v1, v2}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;IZ)V

    return-object v0
.end method

.method public inflate(Lorg/xmlpull/v1/XmlPullParser;Landroid/view/ViewGroup;Z)Landroid/view/View;
    .locals 1
    .param p1, "parser"    # Lorg/xmlpull/v1/XmlPullParser;
    .param p2, "root"    # Landroid/view/ViewGroup;
    .param p3, "attachToRoot"    # Z

    .prologue
    .line 59
    invoke-direct {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->setPrivateFactoryInternal()V

    .line 60
    invoke-super {p0, p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(Lorg/xmlpull/v1/XmlPullParser;Landroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onActivityCreateView(Landroid/view/View;Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2
    .param p1, "parent"    # Landroid/view/View;
    .param p2, "view"    # Landroid/view/View;
    .param p3, "name"    # Ljava/lang/String;
    .param p4, "context"    # Landroid/content/Context;
    .param p5, "attrs"    # Landroid/util/AttributeSet;
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 138
    iget-object v0, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    invoke-direct/range {p0 .. p5}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->createCustomViewInternal(Landroid/view/View;Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, p4, p5}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->onViewCreated(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 3
    .param p1, "parent"    # Landroid/view/View;
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "attrs"    # Landroid/util/AttributeSet;
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    .line 148
    iget-object v0, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    invoke-super {p0, p1, p2, p3}, Landroid/view/LayoutInflater;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v1

    .line 149
    invoke-virtual {p0}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 148
    invoke-virtual {v0, v1, v2, p3}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->onViewCreated(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected onCreateView(Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 6
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    .line 161
    const/4 v1, 0x0

    .line 162
    .local v1, "view":Landroid/view/View;
    sget-object v3, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->sClassPrefixList:[Ljava/lang/String;

    array-length v4, v3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v4, :cond_0

    aget-object v0, v3, v2

    .line 164
    .local v0, "prefix":Ljava/lang/String;
    :try_start_0
    invoke-virtual {p0, p1, v0, p2}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->createView(Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 162
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 170
    .end local v0    # "prefix":Ljava/lang/String;
    :cond_0
    if-nez v1, :cond_1

    invoke-super {p0, p1, p2}, Landroid/view/LayoutInflater;->onCreateView(Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v1

    .line 172
    :cond_1
    iget-object v2, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v1, v3, p2}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->onViewCreated(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v2

    return-object v2

    .line 165
    .restart local v0    # "prefix":Ljava/lang/String;
    :catch_0
    move-exception v5

    goto :goto_1
.end method

.method public setFactory(Landroid/view/LayoutInflater$Factory;)V
    .locals 2
    .param p1, "factory"    # Landroid/view/LayoutInflater$Factory;

    .prologue
    .line 85
    instance-of v0, p1, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;

    if-nez v0, :cond_0

    .line 86
    new-instance v0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;

    iget-object v1, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    invoke-direct {v0, p1, p0, v1}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;-><init>(Landroid/view/LayoutInflater$Factory;Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;Luk/co/chrisjenx/calligraphy/CalligraphyFactory;)V

    invoke-super {p0, v0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    .line 90
    :goto_0
    return-void

    .line 88
    :cond_0
    invoke-super {p0, p1}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    goto :goto_0
.end method

.method public setFactory2(Landroid/view/LayoutInflater$Factory2;)V
    .locals 2
    .param p1, "factory2"    # Landroid/view/LayoutInflater$Factory2;
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 96
    instance-of v0, p1, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory2;

    if-nez v0, :cond_0

    .line 98
    new-instance v0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory2;

    iget-object v1, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    invoke-direct {v0, p1, v1}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory2;-><init>(Landroid/view/LayoutInflater$Factory2;Luk/co/chrisjenx/calligraphy/CalligraphyFactory;)V

    invoke-super {p0, v0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 102
    :goto_0
    return-void

    .line 100
    :cond_0
    invoke-super {p0, p1}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    goto :goto_0
.end method
