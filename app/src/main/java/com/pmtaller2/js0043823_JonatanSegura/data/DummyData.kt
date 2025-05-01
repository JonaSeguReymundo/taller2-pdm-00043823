package com.pmtaller2.js0043823_JonatanSegura.data

import com.pmtaller2.js0043823_JonatanSegura.data.Dish
import com.pmtaller2.js0043823_JonatanSegura.data.Restaurant

object DummyData {
    val restaurants = listOf(
        /* Comida mexicana */
        Restaurant(
            name = "Tacos Tagline Here",
            description = "Deliciosa comida mexicana",
            imageUrl = "https://t3.ftcdn.net/jpg/06/46/87/84/360_F_646878436_DW1KsYTM2J99NYFqKUdH2kcBlqSoljfN.jpg",
            category = "Comida Mexicana",
            menu = listOf(
                Dish("Taco al Pastor", "Tacos con piña", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvPK08Ds3bc9UTX3pjcD5sCnEpWYCYKEChMA&s"),
                Dish("Quesadilla", "Queso derretido", "https://losaltosfoods.com/wp-content/uploads/2022/03/LAF_Quesadillas.jpg")
            )
        ),
        Restaurant(
            name = "Mexican food",
            description = "Sientete como en casa con la comida casera",
            imageUrl = "https://img.freepik.com/vector-gratis/diseno-logo-taqueria-dibujado-mano_23-2149565371.jpg?semt=ais_hybrid&w=740",
            category = "Comida Mexicana",
            menu = listOf(
                Dish("Mole", "Poblano y enmoladas", "https://s1.elespanol.com/2023/05/09/cocinillas/recetas/salsas/762433975_233007923_1024x576.jpg"),
                Dish("Chilaquiles", "Quilaquiles verdes", "https://patijinich.com/es/wp-content/uploads/sites/3/2017/07/207-chilaquiles-verdes.jpg")
            )
        ),
        /* Comida Italiana */
        Restaurant(
            name = "Pizza Planet",
            description = "Auténtica pizza italiana",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTehn6ZGkXeKwQ9LnF4RtwExnB3H3rNdm1WA&s",
            category = "Comida Italiana",
            menu = listOf(
                Dish("Pizza Margarita", "Tomate y albahaca", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZjo9nnM4x4yqYkNG8kQmUvHpcpPr1pvlOGA&s"),
                Dish("Pepperoni", "Con pepperoni clásico", "https://www.sortirambnens.com/wp-content/uploads/2019/02/pizza-de-peperoni.jpg")
            )
        ),
        Restaurant(
            name = "Italian food",
            description = "Desde italia hasta El Salvador, comida originaria de Italia",
            imageUrl = "https://img.freepik.com/vector-premium/emblema-comida-italiana_602006-3422.jpg?semt=ais_hybrid&w=740",
            category = "Comida Italiana",
            menu = listOf(
                Dish("Lassana", "De carne", "https://imagenes.eleconomista.com.mx/files/image_768_768/uploads/2025/01/17/678a8e86d7e3a.jpeg"),
                Dish("Pasta", "Con albondiga", "https://lapiccolastanza.com/wp-content/uploads/2021/08/pasta-en-el-cine-1024x683.jpg")
            )
        ),
        /* Comida rápida */
        Restaurant(
            name = "Big Bear Restaurant",
            description = "Las mejores hamburgesas americanas",
            imageUrl = "https://d1csarkz8obe9u.cloudfront.net/posterpreviews/fast-food-logo-design-template-5e3d4fd2fb94e028469b27c3fc842c92_screen.jpg?ts=1737766720",
            category = "Comida Rápida",
            menu = listOf(
                Dish("Guacamolenator", "Carne de tu preferencia y guacamole", "https://www.cnature.es/wp-content/uploads/2021/12/hamburguesa-con-guacamole.jpg"),
                Dish("Baconator", "Para los amantes de bacon, doble carne y bacon", "https://wendysmx.net/imgmenu/20190322225627.jpg")
            )
        ),
        Restaurant(
            name = "Fast Food",
            description = "La mejor comida rápida",
            imageUrl = "https://img.freepik.com/vector-premium/logotipo-restaurante-comida-rapida-que-dice-comida-rapida_575769-742.jpg?semt=ais_hybrid&w=740",
            category = "Comida Rápida",
            menu = listOf(
                Dish("Hotdogs", "Al dos por uno, los mejores hotdogs", "https://imag.bonviveur.com/hot-dog.jpg"),
                Dish("Papas fritas", "Sasonadas al gusto", "https://i0.wp.com/soyproesa.com/wp-content/uploads/2022/04/recetas-de-papas-fritas.png?fit=1920%2C1281&ssl=1")
            )
        ),
        /* Comida Asiática*/
        Restaurant(
            name = "Sushi Japanese food",
            description = "Los mejores sushis",
            imageUrl = "https://i.pinimg.com/736x/98/45/0e/98450e8298b56755cf863b7e40a1d2cc.jpg",
            category = "Comida Asiática",
            menu = listOf(
                Dish("Sushi salmón", "Sushi Rolls de salmón y Olivada negra", "https://www.oliveradatenea.com/wp-content/uploads/2023/06/Sushi-rolls-de-salmon-y-Olivada-Olivera-dAtenea.jpg"),
                Dish("Sushi Crispy", "Como ciboulette", "https://www.gourmet.cl/wp-content/uploads/2016/09/Crispy-Rolls-iStock-817071822-Nuevo-570x458.jpg")
            )
        ),
        Restaurant(
            name = "Asian Food",
            description = "Las mejor comida asiática",
            imageUrl = "https://img.freepik.com/vector-premium/logotipos-comida-asiatica-dibujados-mano-vector-premium_514761-236.jpg",
            category = "Comida Asiática",
            menu = listOf(
                Dish("Ramen", "Ramen con huevo y carne preferida", "https://resizer.glanacion.com/resizer/v2/ramen-de-fideos-con-caldo-de-EVK46ZF7KNHU3LFBG32TPVPOEM.jpg?auth=e7126622b945551ed143d081f92f592c0fc5ef0bb23003c6d4df6bfda85f9c11&width=1200&height=800&quality=70&smart=true"),
                Dish("DUmplings", "Con salsa de oliva", "https://cdn0.uncomo.com/es/posts/9/5/9/como_hacer_dumplings_chinos_46959_orig.jpg")
            )
        ),
        /* Comida Saludable */
        Restaurant(
            name = "Natural breakfast",
            description = "Los mejores desayunos saludables",
            imageUrl = "https://static.vecteezy.com/system/resources/previews/006/305/637/non_2x/healthy-breakfast-logo-naturally-vector.jpg",
            category = "Comida Saludable",
            menu = listOf(
                Dish("Pudding", "Pudding de chía con fruta", "https://content.clara.es/medio/2024/10/16/desayunos-sin-pan-crep-frutos-rojos_a7503192_241016091932_1280x1280.webp"),
                Dish("Cereal", "Cereal con fruta", "https://www.hola.com/horizon/landscape/2db046b34a7c-adobestock1092554078port.jpg?im=Resize=(640),type=downsize")
            )
        ),
        Restaurant(
            name = "Healthy food",
            description = "Las cenas saludables",
            imageUrl = "https://img.freepik.com/vector-gratis/comida-bebida-logo-comida-sana-plana-dibujada-mano_23-2149632253.jpg",
            category = "Comida Saludable",
            menu = listOf(
                Dish("Omellete", "Con broccoli y queso", "https://viandashoteldelprado.uy/wp-content/uploads/2024/01/Captura-de-Pantalla-2024-01-19-a-las-5.12.57-p.m-600x600.png"),
                Dish("Puré", "Mixto natural", "https://www.vitamina.cl/wp-content/uploads/2020/04/pure_mixto_natural.jpg")
            )
        ),
        /* Postres y dulces */
        Restaurant(
            name = "Borcelle",
            description = "Los mejores postres",
            imageUrl = "https://marketplace.canva.com/EAGDOcHGEes/1/0/1600w/canva-logo-negocio-de-reposter%C3%ADa-y-postres-org%C3%A1nico-bonito-rosa-L1vmOIiNJqY.jpg",
            category = "Postre y Dulces",
            menu = listOf(
                Dish("Flan", "Flan Napolitano", "https://www.recetasnestle.com.mx/sites/default/files/styles/recipe_detail_desktop_new/public/srh_recipes/54c6cbcbc6d611e056122d64560cd9c1.jpg?itok=yfbrq3Mo"),
                Dish("Brownie", "De chocolate", "https://www.clarin.com/2021/08/30/hpCwRCJQX_1200x0__1.jpg")
            )
        ),
        Restaurant(
            name = "Candy Shop",
            description = "Los mejores dulces",
            imageUrl = "https://img.freepik.com/vector-premium/diseno-logotipo-ludico-colorido-tienda-dulces-fuerte-identidad-marca_592024-451.jpg?semt=ais_hybrid&w=740",
            category = "Postre y Dulces",
            menu = listOf(
                Dish("Macarrones", "Franceses", "https://imgmedia.buenazo.pe/1200x660/buenazo/original/2020/10/26/5f970a772f64783bc0287eba.jpg"),
                Dish("Chocolates", "Chocolates de diferentes sabores", "https://www.floristeriatropicalgarden.com.co/wp-content/uploads/2015/04/AC-04-chocolates-381x381.jpg")
            )
        ),
        /* Bebidas */
        Restaurant(
            name = "Yummy Cups",
            description = "Las mejores bebidas heladas",
            imageUrl = "https://images-platform.99static.com/XdaK_Sf-dzR41DNB0qlwZ9X238c=/500x500/top/smart/99designs-contests-attachments/13/13734/attachment_13734266",
            category = "Bebidas",
            menu = listOf(
                Dish("Bubble Tea", "Brown sugar milkshake", "https://assets.epicurious.com/photos/5953ca064919e41593325d97/1:1/w_2560%2Cc_limit/bubble_tea_recipe_062817.jpg"),
                Dish("Frozen", "De galleta", "https://bambuleburger.com/wp-content/uploads/2024/05/FRAPPUCHINO-OREO.png")
            )
        ),
        Restaurant(
            name = "Smoothie Bar",
            description = "Las mejores bebidas caseras y naturales",
            imageUrl = "https://d1csarkz8obe9u.cloudfront.net/posterpreviews/smoothie-natural-juice-bar-logo-design-template-d65c0d2ad68fabe64f3c8cb81545168e_screen.jpg?ts=1627665503",
            category = "Bebidas",
            menu = listOf(
                Dish("Jugo", "Jugo de fresa", "https://cdn0.uncomo.com/es/posts/8/2/8/como_hacer_jugo_de_fresa_28828_orig.jpg"),
                Dish("Licuado", "Licuado de arándanos", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJf86ehOWFxBDv4edmOI0X_OpEaFUpjt3OXA&s")
            )
        )
    )
}
